package com.training.model;

public class AGradeDeduction implements Deduction {

	@Override
	public double computeDeduction(double basicSalary) {

		return basicSalary * .28;
	}

}
