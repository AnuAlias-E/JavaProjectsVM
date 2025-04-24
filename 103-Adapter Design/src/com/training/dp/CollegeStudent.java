package com.training.dp;

public class CollegeStudent implements Student {

	String name;
	String surName;
	String email;

	public CollegeStudent(String name, String surName, String email) {
		super();
		this.name = name;
		this.surName = surName;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "\nCollegeStudent [name=" + name + ", surName=" + surName + ", email=" + email + "]";
	}

}
