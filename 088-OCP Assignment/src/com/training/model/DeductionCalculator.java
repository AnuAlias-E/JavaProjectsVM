package com.training.model;

public class DeductionCalculator {
	public double calculateDeduction(Deduction deduction, double basicSalary) {
		double result = deduction.computeDeduction(basicSalary);
		return result;
	}
}
