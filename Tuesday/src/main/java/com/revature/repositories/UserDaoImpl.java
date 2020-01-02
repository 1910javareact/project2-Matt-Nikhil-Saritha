package com.revature.repositories;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.revature.models.Users;

public class UserDaoImpl {
	
	private SessionFactory sf;
	
	public UserDaoImpl(EntityManagerFactory emf) {
		this.sf=emf.unwrap(SessionFactory.class);
	}
	
	//FindAllUsers
	public List<Users> findAllUsers(){
		List<Users> ret =new ArrayList<>();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query<Users> q = s.createQuery("FROM USERS");
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
	

}
