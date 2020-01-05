package com.revature.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Project;
import com.revature.repositories.ProjectDao;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	private ProjectDao pd;
	
	@Autowired
	public ProjectServiceImpl(ProjectDao pd) {
		this.pd=pd;
	}
	
	
	@Override
	public Project findProjectById(int id) {
		// TODO Auto-generated method stub
		return pd.getOne(id);
	}
	
	@Override
	@Transactional
	public Project saveOneProject(Project p) {
		return pd.save(p);
	}
}