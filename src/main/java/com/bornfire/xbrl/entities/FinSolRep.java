package com.bornfire.xbrl.entities;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface FinSolRep extends CrudRepository<FinSolTb,String> {
	
	  @Query(value = "select sol_id from SOL", nativeQuery = true) 
	List<String> parameterDropdown();

	

	

}
