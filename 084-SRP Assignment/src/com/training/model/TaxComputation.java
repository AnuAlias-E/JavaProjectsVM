package com.training.model;

public class TaxComputation {
	public double getTax(Employee emp) {
		double tax = 0.0;
		if (emp.getGrade() == 'A')
			tax = emp.getBasicSalary() * 0.28;
		if (emp.getGrade() == 'B')
			tax = emp.getBasicSalary() * 0.20;
		if (emp.getGrade() == 'C')
			tax = emp.getBasicSalary() * 0.10;
		return tax;
	}
}
