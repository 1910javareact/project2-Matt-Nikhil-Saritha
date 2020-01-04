package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Table(name="group_data", schema ="tuesdaycom")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})//when writing this object into json, if you find a proxy ignore it
@JsonFilter("depth_4")
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + group_id;
		result = prime * result + ((group_name == null) ? 0 : group_name.hashCode());
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
		GroupData other = (GroupData) obj;
		if (group_id != other.group_id)
			return false;
		if (group_name == null) {
			if (other.group_name != null)
				return false;
		} else if (!group_name.equals(other.group_name))
			return false;
		return true;
	}
	
	
	
}
