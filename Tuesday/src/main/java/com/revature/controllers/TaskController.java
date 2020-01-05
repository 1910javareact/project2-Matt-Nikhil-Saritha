package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Task;
import com.revature.services.TaskService;

@RestController
@RequestMapping("task")
@CrossOrigin
public class TaskController {
	
	private TaskService ts;
	
	@Autowired
	public TaskController(TaskService ts) {
		this.ts=ts;
	}
	
	@GetMapping("{id}")
	public Task findTaskById(@PathVariable int id) {
		return ts.findTaskById(id);
	}
	
	@PostMapping
	public Task saveOneTask(@RequestBody Task t) {
		return ts.saveOneTask(t);
	}

}
