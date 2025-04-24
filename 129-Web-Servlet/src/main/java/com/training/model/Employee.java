package com.training.model;

public class Employee {
	int id;
	String name;
	String gender;
	double basicSalary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String gender, double basicSalary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.basicSalary = basicSalary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", gender=" + gender + ", basicSalary=" + basicSalary + "]";
	}

	public double getAllowance() {
		return this.basicSalary * .35;
	}

	public double getDeduction() {
		return this.basicSalary * .10;
	}

	public double getNetSalary() {
		return this.basicSalary + this.getAllowance() - this.getDeduction();
	}
}
