package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Task;
import com.revature.repositories.TaskDao;

@Service
public class TaskServiceImpl implements TaskService{
	
	private TaskDao td;
	
	@Autowired
	public TaskServiceImpl(TaskDao td) {
		this.td=td;
	}
	
	

	@Override
	public Task findTaskById(int id) {
		// TODO Auto-generated method stub
		return td.getOne(id);
	}

	@Override
	public Task saveOneTask(Task t) {
		// TODO Auto-generated method stub
		return td.save(t);
	}

}
