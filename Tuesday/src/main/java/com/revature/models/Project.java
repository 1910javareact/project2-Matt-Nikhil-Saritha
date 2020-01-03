package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Table(name ="project", schema ="tuesdaycom")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})//when writing this object into json, if you find a proxy ignore it
@JsonFilter("depth_4")
public class Project {
	
	@Id
	@Column(name="project_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int project_id;
	
	@Column(name="project_name")
	private String project_name;
	
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}


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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + project_id;
		result = prime * result + ((project_name == null) ? 0 : project_name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (project_id != other.project_id)
			return false;
		if (project_name == null) {
			if (other.project_name != null)
				return false;
		} else if (!project_name.equals(other.project_name))
			return false;
		return true;
	}
	
	

}
