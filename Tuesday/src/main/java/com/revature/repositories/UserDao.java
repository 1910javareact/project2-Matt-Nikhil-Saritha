package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.models.Users;

public interface UserDao extends JpaRepository<Users,Integer> {
	
	
	@Query ("FROM Users")
    public Users customMethod();
	
	//login
	public Users findByUsernameAndPassword(String username, String password);
	
	
}


