package com.revature.repositories;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.models.Task;

public class TaskDaoImpl {
	
private SessionFactory sf;
	
	@Autowired
	public TaskDaoImpl(EntityManagerFactory emf) {
		this.sf = emf.unwrap(SessionFactory.class);

}
	public Task findTaskById(int id) {
		Session s = sf.openSession();
		Transaction r = s.beginTransaction();
		Query<Task> q = s.createQuery("FROM Task WHERE taskId = :tid");
		q.setParameter("tid", id);
		Task t = q.getSingleResult();
		t.commit ();
		s.close();
		return t;
	}


	public Task saveOneBear(Task t) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction r = s.beginTransaction();
		s.save(t);
		t.commit();
		s.close();
		return t;
	}
}

