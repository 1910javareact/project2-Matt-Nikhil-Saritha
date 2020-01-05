package com.revature.services;

import com.revature.models.Project;

public interface ProjectService {

	Project findProjectById(int id);

	Project saveOneProject(Project p);

}
