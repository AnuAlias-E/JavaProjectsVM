package com.training.model;

public interface SalaryCalculator {
	double computeAllowance(double basic);

	double computeDeduction(double basic);

	double computeNetSalary(double basic);
}
