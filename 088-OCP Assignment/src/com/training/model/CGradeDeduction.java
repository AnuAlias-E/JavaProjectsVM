package com.training.model;

public class CGradeDeduction implements Deduction {

	@Override
	public double computeDeduction(double basicSalary) {

		return basicSalary * .10;
	}

}
