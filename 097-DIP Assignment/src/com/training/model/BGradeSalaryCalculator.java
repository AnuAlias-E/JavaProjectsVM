package com.training.model;

public class BGradeSalaryCalculator implements GradeWiseSalaryCalculator {

	@Override
	public double calculateSalary(double basic) {
		double allowance = basic * 0.25;
		double tax = basic * .15;
		return basic + allowance - tax;
	}

}
