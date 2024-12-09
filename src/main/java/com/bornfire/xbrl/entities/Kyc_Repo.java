package com.bornfire.xbrl.entities;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Kyc_Repo extends JpaRepository<KYC_I, String> {
	@Query(value = "select * from KYC_IND where CUSTOMER_ID = ?1 ", nativeQuery = true)
	List<KYC_I> GetUser(String custid);

	@Query(value = "SELECT customer_id, name, account_number, ACCOUNT_TYPE, ACCOUNT_OPENING_DATE, MODIFY_FLG, "
            + "COUNTRY_OF_CITIZENSHIP, COUNTRY_OF_CURRENT_RESIDENCY, "
            + "FLOOR( REPORT_DATE - CURRENT_DATE) AS days, CUSTOMER_RISK "
            + "FROM kyc_ind "
            + "WHERE del_flg = 'N'", nativeQuery = true)



	List<Object[]> Getlist();

	@Query(value = "SELECT customer_id, name, account_number, ACCOUNT_TYPE, ACCOUNT_OPENING_DATE, MODIFY_FLG, "
			+ "COUNTRY_OF_CITIZENSHIP, COUNTRY_OF_CURRENT_RESIDENCY, "
			+ "FLOOR(MONTHS_BETWEEN(CURRENT_DATE, DATE_OF_BIRTH) / 12) AS age, CUSTOMER_RISK " + "FROM kyc_ind "
			+ "WHERE CUSTOMER_RISK = ?1 AND FLOORFLOOR( REPORT_DATE - CURRENT_DATE) = ?2 "
			+ "AND del_flg = 'N'", nativeQuery = true)
	List<Object[]> GetDynamicValue(String customerRisk, Integer age);

}
