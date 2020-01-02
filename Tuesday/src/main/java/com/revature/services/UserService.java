
package com.revature.services;

import java.util.List;

import com.revature.models.Users;

public interface UserService {
	
	public List<Users> getAllUsers();
	
	public Users saveOneUser(Users u);
	
	public Users findUserByName(String username);
	
	
	
}
