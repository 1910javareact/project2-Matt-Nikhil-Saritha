package com.revature.controllers;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.revature.models.Users;
import com.revature.services.UserService;


// UserRESTController <----> UserService <----> UserDAO <----> DB


@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserController {
	
	private UserService us;
	
	// const injection ???
	@Autowired
	public UserController(UserService us) {
		this.us = us;		
	}
	
	@GetMapping("/users")
	public List<Users> getAllUsers(){
		return us.getAllUsers();
	}
	
	@PostMapping
	public Users saveOneUser(@RequestBody Users u) {
		return us.saveOneUser(u);	
	}
	
	public Users login(@RequestBody String username, HttpServletRequest req) {
		Users u = us.findUserByName(username);
		req.getSession().setAttribute("users", u);
		return u;
	
		
	}

}