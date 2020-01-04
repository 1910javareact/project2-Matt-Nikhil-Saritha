
package com.revature.services;

import java.util.List;

import com.revature.models.Users;

public interface UserService {
	
	//Defining methods
	
	//Get All Users
	public List<Users> getAllUsers();
	
	//Save one User
	public Users saveOneUser(Users u);
	
	//Find User By Username & Password
	public Users getByUsernameAndPassword(String username, String password);
	
	
	
}
