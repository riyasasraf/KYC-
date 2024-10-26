package com.bornfire.xbrl.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;

import javax.sql.DataSource;
import javax.validation.constraints.NotNull;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.bornfire.xbrl.entities.XBRLProceduresRep;
import com.bornfire.xbrl.entities.XBRLReportsMasterRep;

import net.sf.jasperreports.engine.JRException;

@Component
@Service
@Transactional
@ConfigurationProperties("output")
public class RegulatoryReportServices {

	private static final Logger logger = LoggerFactory.getLogger(RegulatoryReportServices.class);

	@NotNull
	private String exportpath;

	@Autowired
	XBRLReportsMasterRep xbrlReportsMasterRep;

	@Autowired
	XBRLProceduresRep xbrlProceduresRep;

	@Autowired
	DataSource srcdataSource;

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	CustomRepGeneratorServices customerrptgenserviceexcel;

	@Autowired
	BRF001ReportService brf001ReportService;

	@Autowired
	BRFReportService brfReportService;

	@Autowired
	DEMOReportService DemoReportService;

	@Autowired
	BRF2_SERVICE BRF2_SERVICE;
	
	@Autowired
	BRF071_Service BRF071_Service;

	String getExportpath() {
		return exportpath;
	}

	public void setExportpath(String exportpath) {
		this.exportpath = exportpath;
	}

	public ModelAndView getReportView(String reportId, String reportDate, String fromdate, String todate,
			String currency, String dtltype, String subreportid, String secid, String reportingTime,
			Pageable pageable) {

		ModelAndView repsummary = new ModelAndView();

		logger.info("Getting View for the Report :" + reportId);
		switch (reportId) {

		case "BRF001":
			repsummary = brf001ReportService.getBRF001View(reportId, fromdate, todate, currency, dtltype, pageable);
			break;

		case "BRF":
			repsummary = brfReportService.getBRFView(reportId, fromdate, todate, currency, dtltype, pageable);
			break;

		case "DEMO":
			repsummary = DemoReportService.getDemoView(reportId, fromdate, todate, currency, dtltype, pageable);
			break;

		case "BRF002":
			repsummary = BRF2_SERVICE.getBRF002View(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
			
		 case "BRF071":
			repsummary = BRF071_Service.getBRF071View(reportId, fromdate, todate, currency, dtltype, pageable);
			break;


		}

		return repsummary;
	}

	public ModelAndView getReportSummary(String reportId, String reportDate, String fromdate, String todate,
			String currency, String dtltype, String subreportid, String secid, String reportingTime,
			Pageable pageable) {

		ModelAndView repsummary = new ModelAndView();
		logger.info("Getting Summary for the Report :" + reportId);
		switch (reportId) {

		case "BRF001":
			repsummary = brf001ReportService.getBRF001View(reportId, fromdate, todate, currency, dtltype, pageable);
			break;

		case "BRF":
			repsummary = brfReportService.getBRFView(reportId, fromdate, todate, currency, dtltype, pageable);
			break;

		case "DEMO":
			repsummary = DemoReportService.getDemoView(reportId, fromdate, todate, currency, dtltype, pageable);
			break;

		case "BRF002":
			repsummary = BRF2_SERVICE.getBRF002View(reportId, fromdate, todate, currency, dtltype, pageable);
			break;
			
		case "BRF071":
			repsummary = BRF2_SERVICE.getBRF002View(reportId, fromdate, todate, currency, dtltype, pageable);
			break;


		}

		return repsummary;
	}

	public ModelAndView getReportDetails(String reportId, String instanceCode, String asondate, String fromdate,
			String todate, String currency, String reportingTime, String dtltype, String subreportid, String secid,
			Pageable pageable, String Filter) {

		ModelAndView repdetail = new ModelAndView();
		logger.info("Getting Details for the Report :" + reportId);

		switch (reportId) {

		case "BRF001":
			repdetail = brf001ReportService.getBRF001currentDtl(reportId, fromdate, todate, currency, dtltype, pageable,
					Filter);
			break;
		case "BRF":
			repdetail = brfReportService.getBRFDetail(reportId, fromdate, todate, currency, dtltype, pageable, Filter);
			break;

		}
		return repdetail;
	}

	public File getDownloadFile(String reportId, String asondate, String fromdate, String todate, String currency,
			String subreportid, String secid, String dtltype, String reportingTime, String filetype,
			String instancecode) throws FileNotFoundException, JRException, SQLException {

		File repfile = null;

		logger.info("Getting Report File for : " + reportId + " in " + filetype + " format");

		switch (reportId) {
		case "BRF001":
			repfile = brf001ReportService.getFile(reportId, fromdate, todate, currency, dtltype, filetype);
			break;
		case "BRF":
			repfile = brfReportService.getFile(reportId, fromdate, todate, currency, dtltype, filetype);
			break;
		case "BRF002":
			repfile = BRF2_SERVICE.getFile(reportId, fromdate, todate, currency, dtltype, filetype);
			break;
			
		case "BRF071":
			repfile = BRF071_Service.getFile(reportId, fromdate, todate, currency, dtltype, filetype);
			break;
			
		}
			

		return repfile;

	}

	public String preCheckReportRBS(String reportid, String fromdate, String todate) {

		String msg = "";

		logger.info("Report precheck : " + reportid);

		switch (reportid) {

		case "BRF001":
			msg = brf001ReportService.preCheck(reportid, fromdate, todate);
			break;

		case "BRF002":
			msg = BRF2_SERVICE.preCheck(reportid, fromdate, todate);
			break;

		case "BRF071":
			msg = BRF071_Service.preCheck(reportid, fromdate, todate);
			break;
			
			
			
		case "BRF":
			msg = brfReportService.preCheck(reportid, fromdate, todate);
			break;

		case "DEMO":
			msg = DemoReportService.preCheck(reportid, fromdate, todate);
			break;

		default:
			logger.info("default -> preCheck()");
			msg = "Master - need to process";
		}

		return msg;
	}
}
