package com.training.model;

public class Employee {
	private int id;
	private String name;
	private char grade;
	private double basicSalary;

	public Employee(int id, String name, char grade, double basicSalary) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
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

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", grade=" + grade + ", basicSalary=" + basicSalary + "]";
	}

}
