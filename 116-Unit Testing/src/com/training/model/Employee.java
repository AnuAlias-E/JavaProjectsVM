package com.training.model;

public class Employee {
	double basicSalary;
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		if (name == null || name.isEmpty()) {
			Exception e = new Exception("Invalid Value for name");

			throw e;
		}
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) throws Exception {
		if (basicSalary < 0) {
			throw new Exception("Negative Salary Not Acceptable");
		}
		this.basicSalary = basicSalary;
	}

}
