package com.training.model;

public class NetSalaryComputation {
	public double getNetSalary(Employee emp) {
		AllowanceComputation allowanceCalc = new AllowanceComputation();
		TaxComputation taxCalc = new TaxComputation();
		return emp.getBasicSalary() + allowanceCalc.getAllowance(emp) - taxCalc.getTax(emp);
	}
}
