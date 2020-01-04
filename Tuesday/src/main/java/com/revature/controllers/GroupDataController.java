package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.GroupData;
import com.revature.services.GroupDataService;


@RestController
@RequestMapping("group")
@CrossOrigin
public class GroupDataController {
	
	private GroupDataService gds;
	
	@Autowired
	public GroupDataController(GroupDataService gds) {
	this.gds = gds;
	}
	
	
	@GetMapping("{id}")
	public GroupData findGroupById(@PathVariable int id) {
		return gds.findGroupById(id);
	}

}
