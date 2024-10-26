package com.bornfire.xbrl.entities;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Kyc_Corprate_Repo extends JpaRepository<Kyc_Corprate, String> {

	@Query(value = "select * from kyc_corp where CUSTOMER_ID = ?1 ", nativeQuery = true)
	List<Kyc_Corprate> GetUser(String custid);

	@Query(value = "SELECT CUSTOMER_ID, COMPANY_NAME,ACCOUNT_NUMBER,TRADE_LICENSE_NUMBER,MODIFY_FLG FROM kyc_corp WHERE del_flg = 'N'", nativeQuery = true)
	List<Object[]> Getlist();
}
