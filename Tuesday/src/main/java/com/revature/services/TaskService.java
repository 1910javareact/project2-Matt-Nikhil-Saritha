package com.revature.services;

import com.revature.models.Task;

public interface TaskService {

	Task findTaskById(int id);

	Task saveOneTask(Task t);

}