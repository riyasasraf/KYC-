package com.bornfire.xbrl.services;

import java.math.BigDecimal;
import java.util.Date;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bornfire.xbrl.entities.BRF.RBSTransactionMasterEntity;

@Service
@Transactional
@ConfigurationProperties("output")
public class CustomerDetailService {
	private static final Logger logger = LoggerFactory.getLogger(CustomerDetailService.class);

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	DataSource srcdataSource;
	
	@Autowired
	Environment env;
	
	
	public String detailChanges(RBSTransactionMasterEntity detail, Character changeType, String userid,Date todate) {

		String msg = "";
				try {
			
			Session hs = sessionFactory.getCurrentSession();
			Query qr =  hs.createNativeQuery("select RBSTRANSACTIONMASTER_SRL_NUM.NEXTVAL from DUAL");
			

				if (changeType.equals('A')) {
				
				
				detail.setTran_date(new Date());
				detail.setDel_flg('N'); 
				//Date d="31-MAR-23";

				detail.setReport_date(todate);
				detail.setSrl_num((BigDecimal) qr.uniqueResult());
				hs.save(detail);
				
				logger.info("Added Record");
				msg = "Added Successfully";
			} else if (changeType.equals('E')) {
				
				//detail.setCust_id(userid);
				//detail.setTran_date(new Date());
				System.out.println(detail.getSrl_num());
				hs.update(detail);
				logger.info("Edited Record");
				msg = "Edited Successfully";
				
			} else if (changeType.equals('D')) {
				
				//detail.setCust_id(userid);
				//detail.setTran_date(new Date());
				detail.setDel_flg('Y'); 
				hs.delete(detail);
				logger.info("Deleted Record");
				msg = "Deleted Successfully";
			}

		} catch (Exception e) {

			msg = "error occured. Please contact Administrator";
			e.printStackTrace();
		}

		return msg;
	}




}
