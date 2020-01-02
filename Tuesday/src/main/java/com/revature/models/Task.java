package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task", schema= "tuesdaycom")
public class Task {
	@Id
	@Column(name= "task_id")
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int task_id;
	@Column (name="task_name")
	private String task_name;
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

}
