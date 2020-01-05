package com.revature.repositories;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.models.Users;

public class UserDaoImpl {
	
	private SessionFactory sf;
	
	//Get current Hibernate Session
	@Autowired
	public UserDaoImpl(EntityManagerFactory emf) {
		this.sf= emf.unwrap(SessionFactory.class);
	}
	
	//FindAllUsers
	//@Transactional --> NO need to do manually - t begin & commit 
	// if we have service no need @Transactional at all
	public List<Users> findAllUsers(){
		
		List<Users> ret =new ArrayList<>();
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query<Users> q = s.createQuery("FROM Users");
		ret = q.list();
		t.commit();
		s.close();
		return ret;
	}
	
	//SaveOneUser
	public Users saveOneUser(Users u) {
		
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(u);
		t.commit();
		s.close();
		return u;
	}

	
	public Users findUserById(int id) {
		Session s =sf.openSession();
		Transaction t = s.beginTransaction();
		Query<Users> q = s.createQuery("FROM Users where userId = :uid");
		q.setParameter("bid", id);
		Users u =q.getSingleResult();
		t.commit();
		s.close();
		return u;
	}

}
