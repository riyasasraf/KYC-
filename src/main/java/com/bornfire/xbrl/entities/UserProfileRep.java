package com.bornfire.xbrl.entities;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRep extends CrudRepository<UserProfile,String>{
	

	public Optional<UserProfile> findByusername(String userName);
	
	
}
