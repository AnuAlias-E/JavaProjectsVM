package com.training.model;

public class Person {
	int personId;
	String name;
	String gender;
	int age;
	public Person() {
		super();
	}
	public Person(int personId, String name, String gender, int age) {
		super();
		this.personId = personId;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	@Override
	public String toString() {
		return "\nPerson [personId=" + personId + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + personId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		if (personId != other.personId)
			return false;
		return true;
	}
	
	
}
