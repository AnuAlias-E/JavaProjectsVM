package com.training.model;

public class CGradeSalaryCalculator implements GradeWiseSalaryCalculator {

	@Override
	public double calculateSalary(double basic) {
		double allowance = basic * 0.15;
		double tax = basic * .05;
		return basic + allowance - tax;
	}

}
