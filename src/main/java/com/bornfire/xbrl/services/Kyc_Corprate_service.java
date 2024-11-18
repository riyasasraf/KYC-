package com.bornfire.xbrl.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Optional;

import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.bornfire.xbrl.entities.Kyc_Corprate;
import com.bornfire.xbrl.entities.Kyc_Corprate_Repo;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

@Service
public class Kyc_Corprate_service {
	@Autowired
	Environment env;
	@Autowired
	DataSource srcdataSource;

	@Autowired
	private Kyc_Corprate_Repo Kyc_Corprate_Repo;
	@Autowired
	private HttpSession session;

	public boolean updateKycData(String customerId, Kyc_Corprate data) {
		// Find the existing KYC record
		
		Optional<Kyc_Corprate> optionalKyc = Kyc_Corprate_Repo.findById(customerId);
		String userId = (String) session.getAttribute("USERID");
		LocalDateTime currentDateTime = LocalDateTime.now();

		if (optionalKyc.isPresent()) {
			Kyc_Corprate kycEntity = optionalKyc.get();

			// Use reflection to update the entity fields
			for (Field field : Kyc_Corprate.class.getDeclaredFields()) {
				field.setAccessible(true); // Make private fields accessible

				try {
					// Get the value from the data object
					Object value = field.get(data);

					// Only update if the value is not null
					if (value != null) {
						// Handle specific type conversions if necessary
						if (field.getType() == LocalDateTime.class && value instanceof String) {
							// Example of converting String to LocalDateTime
							DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
							value = LocalDateTime.parse((String) value, formatter);
						} else if (field.getType() == Date.class && value instanceof String) {
							// Example of converting String to Date (if you want to keep Date)
							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
							value = sdf.parse((String) value);
						}
						// Set the value in the entity
						field.set(kycEntity, value);
					}
				} catch (IllegalAccessException e) {
					System.err.println("Access error: " + e.getMessage());
				} catch (ParseException e) {
					System.err.println("Date parsing error: " + e.getMessage());
				}
			}

			// Set metadata fields
			kycEntity.setModifyFlg('Y');
			kycEntity.setEntityFlg('N');
			kycEntity.setModifyUser(userId);
			kycEntity.setModifyTime(Date.from(currentDateTime.atZone(ZoneId.systemDefault()).toInstant()));

			// Save the updated entity to the database
			Kyc_Corprate_Repo.save(kycEntity);
			return true;
		} else {

			return false;
		}
	}

	public Boolean verified(String customerId) {

		Optional<Kyc_Corprate> optionalKyc = Kyc_Corprate_Repo.findById(customerId);
		String userId = (String) session.getAttribute("USERID");
		LocalDateTime currentDateTime = LocalDateTime.now();
		if (optionalKyc.isPresent()) {

			Kyc_Corprate kycEntity = optionalKyc.get();

			kycEntity.setModifyFlg('N');
			kycEntity.setEntityFlg('Y');
			kycEntity.setVerifyUser(userId);
			kycEntity.setVerifyTime(Date.from(currentDateTime.atZone(ZoneId.systemDefault()).toInstant()));

			Kyc_Corprate_Repo.save(kycEntity);
			return true;
		}
		return false;

	}

	public File GrtPdf(String Cust_Id) throws FileNotFoundException, JRException, SQLException {
		String path = env.getProperty("output.exportpath");
		String fileName = "";
		File outputFile = null;

		try {
			fileName = Cust_Id + ".pdf";
			path = path + fileName;
			System.out.println("Generated file path: " + path);

			InputStream jasperFile = this.getClass().getResourceAsStream("/static/jasper/KYC_Corprate.jrxml");

			if (jasperFile == null) {
				throw new FileNotFoundException("Jasper template not found");
			}

			JasperReport jr = JasperCompileManager.compileReport(jasperFile);

			HashMap<String, Object> map = new HashMap<>();

			map.put("Customer_ID", Cust_Id);
			/* map.put("IMAGE_DIR", "/static/jasper/"); */// or wherever the image is located

			System.out.println("Generating PDF");
			JasperPrint jp = JasperFillManager.fillReport(jr, map, srcdataSource.getConnection());
			JasperExportManager.exportReportToPdfFile(jp, path);
			System.out.println("PDF generated successfully");

			outputFile = new File(path);
		} catch (Exception e) {
			System.out.println("Error generating PDF: " + e.getMessage());
			e.printStackTrace();
			throw e; // Re-throw the exception to see in the logs
		}

		return outputFile;
	}

}
