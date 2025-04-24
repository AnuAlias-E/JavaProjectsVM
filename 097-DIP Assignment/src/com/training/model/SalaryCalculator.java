package com.training.model;

public class SalaryCalculator {
	GradeWiseSalaryCalculator calculator;

	public SalaryCalculator(GradeWiseSalaryCalculator calculator) {
		super();
		this.calculator = calculator;
	}

	public void printSalary(double basic) {
		System.out.println("Salary : " + this.calculator.calculateSalary(basic));
	}
}
