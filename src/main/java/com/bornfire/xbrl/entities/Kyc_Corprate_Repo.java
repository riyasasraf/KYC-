package com.bornfire.xbrl.entities;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Kyc_Corprate_Repo extends JpaRepository<Kyc_Corprate, String> {

	@Query(value = "select * from kyc_corp where CUSTOMER_ID = ?1 ", nativeQuery = true)
	List<Kyc_Corprate> GetUser(String custid);

	@Query(value = "SELECT " + "CUSTOMER_ID, " + "COMPANY_NAME, " + "ACCOUNT_NUMBER, " + "TRADE_LICENSE_NUMBER, "
			+ "MODIFY_FLG, " + "TRADE_LICENSE_ISSUE_DATE, " + "TRADE_LICENSE_EXPIRY_DATE, "
			+ "FLOOR( REPORT_DATE - CURRENT_DATE) AS days, " + "CUSTOMER_RISK " + "FROM kyc_corp "
			+ "WHERE del_flg = 'N'", nativeQuery = true)
	List<Object[]> getList();

	@Query(value = "SELECT CUSTOMER_ID, COMPANY_NAME, ACCOUNT_NUMBER, TRADE_LICENSE_NUMBER, MODIFY_FLG, "
			+ "TRADE_LICENSE_ISSUE_DATE, TRADE_LICENSE_EXPIRY_DATE, "
			+ "FLOOR(REPORT_DATE - CURRENT_DATE) AS days, CUSTOMER_RISK " + "FROM kyc_corp "
			+ "WHERE CUSTOMER_RISK = ?1 " + "AND FLOOR(REPORT_DATE - CURRENT_DATE) = ?2 "
			+ "AND del_flg = 'N'", nativeQuery = true)
	List<Object[]> getDynamicValue(String customerRisk, Integer days);

}