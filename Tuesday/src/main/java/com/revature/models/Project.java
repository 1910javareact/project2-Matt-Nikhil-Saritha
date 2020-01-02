package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="project", schema ="tuesdaycom")
public class Project {
	
	@Id
	@Column(name="project_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int project_id;
	
	@Column(name="project_name")
	private String project_name;
	
	
	public Project(int project_id, String project_name) {
		super();
		this.project_id = project_id;
		this.project_name = project_name;
	}


	public int getProject_id() {
		return project_id;
	}


	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}


	public String getProject_name() {
		return project_name;
	}


	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}


	@Override
	public String toString() {
		return "Project [project_id=" + project_id + ", project_name=" + project_name + "]";
	}
	
	

}
