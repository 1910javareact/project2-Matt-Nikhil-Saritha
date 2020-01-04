package com.revature.repositories;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.models.GroupData;
import com.revature.services.GroupDataService;

public class GroupDataDaoImpl {
	
	private SessionFactory sf;
	
	 @Autowired
	 public GroupDataDaoImpl(EntityManagerFactory emf) {
		 this.sf = emf.unwrap(SessionFactory.class);
	 }

	
	public GroupData findGroupById(int id) {
		// TODO Auto-generated method stub
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query<GroupData> q = s.createQuery("FROM GroupData WHERE group_id = :gid");
		q.setParameter("gid", id);
		GroupData gd = q.getSingleResult();
		t.commit();
		s.close();

		return gd;
	}
	
	

}
