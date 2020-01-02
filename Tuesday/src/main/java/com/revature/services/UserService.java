
package com.revature.services;

import java.util.List;

import com.revature.models.Users;

public interface UserService {
	
	//Defining methods
	
	public List<Users> getAllUsers();
	
	public Users saveOneUser(Users u);
	
	public Users findUserByName(String username);
	
	
	
}
