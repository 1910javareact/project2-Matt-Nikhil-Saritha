package com.revature.repositories;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.models.Project;

public class ProjectDaoImpl {
	
	private SessionFactory sf;
	
	@Autowired
	public ProjectDaoImpl(EntityManagerFactory emf) {
		this.sf = emf.unwrap(SessionFactory.class);
	}
	
	public Project findProjectById(int id) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query<Project> q = s.createQuery("FROM Project WHERE project_id = :pid");
		q.setParameter("pid", id);
		Project p = q.getSingleResult();
		t.commit();
		s.close();
		return p;
	}
	
	public Project saveOneProject(Project p) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(p);
		t.commit();
		s.close();
		return p;
		
	}

}