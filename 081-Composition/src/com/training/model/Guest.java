package com.training.model;

public class Guest {

	String name;
	String phoneNumber;
	String nationality;
	String gender;

	public Guest() {
		super();
	}

	public Guest(String name, String phoneNumber, String nationality, String gender) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.nationality = nationality;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "\nGuest [name=" + name + ", phoneNumber=" + phoneNumber + ", nationality=" + nationality + ", gender="
				+ gender + "]";
	}

}
