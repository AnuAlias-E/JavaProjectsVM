package com.training.model;

import java.util.Arrays;

public class Person {
	String name;
	int age;
	String[] emailIds;
	String[] contactNumbers;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String[] getEmailIds() {
		return emailIds;
	}

	public void setEmailIds(String[] emailIds) {
		this.emailIds = emailIds;
	}

	public String[] getContactNumbers() {
		return contactNumbers;
	}

	public void setContactNumbers(String[] contactNumbers) {
		this.contactNumbers = contactNumbers;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", emailIds=" + Arrays.toString(emailIds) + ", contactNumbers="
				+ Arrays.toString(contactNumbers) + "]";
	}

}
