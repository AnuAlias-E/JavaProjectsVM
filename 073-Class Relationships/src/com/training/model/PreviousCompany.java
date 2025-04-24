package com.training.model;

public class PreviousCompany {
	private String name;
	private String designation;
	private int years;
	private double salary;

	public PreviousCompany() {
		super();
	}

	public PreviousCompany(String name, String designation, int years, double salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.years = years;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PreviousCompany [name=" + name + ", designation=" + designation + ", years=" + years + ", salary="
				+ salary + "]";
	}
}
