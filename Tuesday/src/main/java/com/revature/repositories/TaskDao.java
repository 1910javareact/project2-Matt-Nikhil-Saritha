package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.models.Task;

public interface TaskDao extends JpaRepository<Task, Integer> {
	
	@Query("FROM Task")
	public Task customMethod();

}