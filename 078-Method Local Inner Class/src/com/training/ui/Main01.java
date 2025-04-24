package com.training.ui;

import com.training.model.Employee;

public class Main01 {
public static void main(String[] args) {
	Employee emp = new Employee();
	emp.basicSalary=1000.00;
	System.out.println(emp.getAllowance());
}
}
