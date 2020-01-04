package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Table(name = "task", schema= "tuesdaycom")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})//when writing this object into json, if you find a proxy ignore it
@JsonFilter("depth_4")
public class Task {
	@Id
	@Column(name= "task_id")
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int task_id;
	@Column (name="task_name")
	private String task_name;
	
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Task(int task_id, String task_name) {
		super();
		this.task_id = task_id;
		this.task_name = task_name;
	}
	
	
	public int getTask_id() {
		return task_id;
	}
	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	@Override
	public String toString() {
		return "Task [task_id=" + task_id + ", task_name=" + task_name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + task_id;
		result = prime * result + ((task_name == null) ? 0 : task_name.hashCode());
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
		Task other = (Task) obj;
		if (task_id != other.task_id)
			return false;
		if (task_name == null) {
			if (other.task_name != null)
				return false;
		} else if (!task_name.equals(other.task_name))
			return false;
		return true;
	}

	
	
}
