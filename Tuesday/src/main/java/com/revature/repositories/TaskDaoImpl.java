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
		Transaction t = s.beginTransaction();
		Query<Task> q = s.createQuery("FROM Task WHERE task_id = :tid");
		q.setParameter("tid", id);
		Task task = q.getSingleResult();
		t.commit ();
		s.close();
		return task;
	}


	public Task saveOneBear(Task task) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(task);
		t.commit();
		s.close();
		return task;
	}
}

