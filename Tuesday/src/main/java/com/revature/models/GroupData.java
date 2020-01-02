package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="group_data", schema ="tuesdaycom")
public class GroupData {
	
	@Id
	@Column(name= "group_id")
	@GeneratedValue (strategy= GenerationType.IDENTITY)
    private int group_id;
	
	@Column (name= "group_name")
    private String group_name;
	
	
	
	public GroupData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GroupData(int group_id, String group_name) {
		super();
		this.group_id = group_id;
		this.group_name = group_name;
	}

	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	@Override
	public String toString() {
		return "GroupData [group_id=" + group_id + ", group_name=" + group_name + "]";
	}
	
	
	
}
