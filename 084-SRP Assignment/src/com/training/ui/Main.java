package com.training.ui;

import com.training.model.AllowanceComputation;
import com.training.model.Employee;
import com.training.model.NetSalaryComputation;
import com.training.model.TaxComputation;

public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee(102, "Anu", 'B', 20000.00);

		System.out.println("Employee Details");
		System.out.println("---------------------------------");
		System.out.println("Id : " + emp.getId());
		System.out.println("Name : " + emp.getName());
		System.out.println("Grade : " + emp.getGrade());
		System.out.println("Basic Salary : " + emp.getBasicSalary());
		System.out.println("---------------------------------");
		AllowanceComputation allowanceComputation = new AllowanceComputation();
		System.out.println("Allowance Amt: " + allowanceComputation.getAllowance(emp));
		System.out.println("---------------------------------");
		TaxComputation taxComputation = new TaxComputation();
		System.out.println("Tax Amount : " + taxComputation.getTax(emp));
		System.out.println("---------------------------------");
		NetSalaryComputation netSalaryComputation = new NetSalaryComputation();
		System.out.println("Net Salary : " + netSalaryComputation.getNetSalary(emp));
	}
}
