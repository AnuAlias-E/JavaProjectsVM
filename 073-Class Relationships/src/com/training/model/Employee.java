package com.training.model;

public class Employee {
	private int id;
	private String name;
	private char grade;
	private String gender;
	private double basicSalary;
	private Contact contactInfo;// HAS-A Relationship..Aggregation
	private PreviousCompany previousCompany;// HAS- A Relationship..Aggregation
	private SalaryCalculator salaryCalculator;// HAS- A Relationship..Aggregation

	public Employee(int id, String name, char grade, String gender, double basicSalary, Contact contactInfo,
			PreviousCompany previousCompany) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.gender = gender;
		this.basicSalary = basicSalary;
		this.contactInfo = contactInfo;
		this.previousCompany = previousCompany;
	}

	public Employee() {
		super();
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
		if (this.grade == 'A')
			salaryCalculator = new AGradeSalaryCalculator();
		if (this.grade == 'B')
			salaryCalculator = new BGradeSalaryClaculator();
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

	public Contact getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(Contact contactInfo) {
		this.contactInfo = contactInfo;
	}

	public PreviousCompany getPreviousCompany() {
		return previousCompany;
	}

	public void setPreviousCompany(PreviousCompany previousCompany) {
		this.previousCompany = previousCompany;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", grade=" + grade + ", gender=" + gender + ", basicSalary="
				+ basicSalary + ", contactInfo=" + contactInfo + ", previousCompany=" + previousCompany + "]";
	}

	public SalaryCalculator getSalaryCalculator() {
		return salaryCalculator;
	}

	public void setSalaryCalculator(SalaryCalculator salaryCalculator) {
		this.salaryCalculator = salaryCalculator;
	}

	public double getAllowance() {
		double allowance = this.salaryCalculator.computeAllowance(basicSalary);
		return allowance;
	}

	public double getDeduction() {
		double allowance = this.salaryCalculator.computeDeduction(basicSalary);
		return allowance;
	}

	public double getNetSalary() {
		double net = this.salaryCalculator.computeNetSalary(basicSalary);
		return net;
	}
}
