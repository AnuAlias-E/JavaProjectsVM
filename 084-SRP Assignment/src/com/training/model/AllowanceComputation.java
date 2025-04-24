package com.training.model;

public class AllowanceComputation {
	public double getAllowance(Employee employee) {
		double allowance = 0.0;
		if (employee.getGrade() == 'A')
			allowance = employee.getBasicSalary() * 0.35;
		if (employee.getGrade() == 'B')
			allowance = employee.getBasicSalary() * 0.25;
		if (employee.getGrade() == 'C')
			allowance = employee.getBasicSalary() * 0.20;
		return allowance;
	}
}
