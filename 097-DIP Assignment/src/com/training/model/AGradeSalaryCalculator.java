package com.training.model;

public class AGradeSalaryCalculator implements GradeWiseSalaryCalculator {

	@Override
	public double calculateSalary(double basic) {
		double allowance=basic*0.35;
		double tax=basic*.28;
		return basic+allowance-tax;
	}

}
