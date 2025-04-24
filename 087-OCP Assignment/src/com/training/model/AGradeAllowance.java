package com.training.model;

public class AGradeAllowance implements Allowance {

	@Override
	public double calculateAllowance(double basicSalary) {

		return 0.35 * basicSalary;
	}

}
