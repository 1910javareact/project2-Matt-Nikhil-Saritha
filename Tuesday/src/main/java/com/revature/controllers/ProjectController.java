package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Project;
import com.revature.services.ProjectService;

@RestController
@RequestMapping ("project")
@CrossOrigin
public class ProjectController {
private  ProjectService ps;
	
	@Autowired
	public ProjectController(ProjectService ps) {
		this.ps=ps;
	}
	
	@GetMapping("{id}")
    public Project findProjectById(@PathVariable int id) {
		return ps.findProjectById(id);
	}
	
	@PostMapping
	public Project saveOneProject(@RequestBody Project p) {
	return ps.saveOneProject(p);	
	}

}
