package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.models.Project;
import com.revature.models.Users;

public interface ProjectDao extends JpaRepository<Project, Integer> {
	
	@Query("FROM Project")
	public Project customMethod();
	
	public Project findProjectById(int id);

}