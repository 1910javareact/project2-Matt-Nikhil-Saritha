package com.revature.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.revature.models.Users;
import com.revature.repositories.UserDao;



@Service
public class UserServiceImpl implements UserService {
	
	// to use Dao & with constructor injection
	private UserDao ud;
	
	@Autowired
	public UserServiceImpl(UserDao ud) {
		this.ud = ud;
	}

	
	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return ud.findAll();
	}

	
	@Override
	@Transactional
	public Users saveOneUser(Users u) {
		// TODO Auto-generated method stub
		return ud.save(u);
	}

	
	@Override
	public Users getByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return ud.findByUsernameAndPassword(username, password);
	}
}
