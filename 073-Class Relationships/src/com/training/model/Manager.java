package com.training.model;

//IS - A Relationship
//Manager class depends Employee Class. 
public class Manager extends Employee {

	private int employeeCount;

	public Manager(int id, String name, char grade, String gender, double basicSalary, Contact contactInfo,
			PreviousCompany previousCompany) {
		super(id, name, grade, gender, basicSalary, contactInfo, previousCompany);
	}

	public Manager(int id, String name, char grade, String gender, double basicSalary, Contact contactInfo,
			PreviousCompany previousCompany, int employeeCount) {
		super(id, name, grade, gender, basicSalary, contactInfo, previousCompany);
		this.employeeCount = employeeCount;
	}

	public Manager() {
		super();
	}

	@Override
	public String toString() {
		return "Manager [" + "\nId=" + getId() + "\nName=" + getName() + "\nGrade=" + getGrade() + "\nGender="
				+ getGender() + "\nBasicSalary=" + getBasicSalary() + "\nEmployeeCount=" + employeeCount
				+ "\nContactInfo=" + getContactInfo() + "\nPreviousCompany=" + getPreviousCompany() + "\nAllowance="
				+ getAllowance() + "\nDeduction=" + getDeduction() + "\nNetSalary=" + getNetSalary() + "]";
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

}
