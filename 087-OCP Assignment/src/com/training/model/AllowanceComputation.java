package com.training.model;

public class AllowanceComputation {
	public double computeAllowance(Allowance allowance, double basicSalary) {
		double result = allowance.calculateAllowance(basicSalary);

		return result;
	}

}
