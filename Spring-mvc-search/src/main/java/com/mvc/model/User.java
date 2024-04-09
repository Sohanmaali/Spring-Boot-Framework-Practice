package com.mvc.model;

import java.util.List;
import java.util.Date;

public class User {
	private String name;
	private Long id;
	private Date dob;
	private List<String> course;
	private String gender;
	private String type;

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", dob=" + dob + ", course=" + course + ", gender=" + gender
				+ ", type=" + type + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<String> getCourse() {
		return course;
	}

	public void setCourse(List<String> course) {
		this.course = course;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
