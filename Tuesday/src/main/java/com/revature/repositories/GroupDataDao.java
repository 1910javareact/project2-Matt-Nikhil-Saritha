package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.GroupData;


public interface GroupDataDao extends JpaRepository<GroupData, Integer>  {
	
	 public GroupData findGroupById(int id);

}
