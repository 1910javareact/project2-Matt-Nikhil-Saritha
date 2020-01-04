package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.revature.models.GroupData;
import com.revature.repositories.GroupDataDao;

@Service
public class GroupDataServiceImpl implements GroupDataService {
	
	private GroupDataDao gdd;
	
	@Autowired
	public GroupDataServiceImpl(GroupDataDao gdd) {
		this.gdd = gdd;
	}

	@Override
	public GroupData findGroupById(int id) {
		// TODO Auto-generated method stub
		return gdd.getOne(id);
	}

}
