package com.bornfire.xbrl.entities;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
 

@Repository
public interface LOANELIGIBILITYREP extends JpaRepository<LOAN_ELIGIBILITY_PARAMETER_ENTITY, String> {

	Optional<LOAN_ELIGIBILITY_PARAMETER_ENTITY> findById(String directorId);

	@Query(value = "select * from LOAN_ELIGIBILITY_PARAMETER WHERE del_flg <>'Y'", nativeQuery = true)
	List<LOAN_ELIGIBILITY_PARAMETER_ENTITY> findAllCustom();
	
	 @Query(value = "select * from LOAN_ELIGIBILITY_PARAMETER where product_code=?1 ", nativeQuery = true) 
	 LOAN_ELIGIBILITY_PARAMETER_ENTITY findByIdcustom(String rpt_ref_no);

	 
}