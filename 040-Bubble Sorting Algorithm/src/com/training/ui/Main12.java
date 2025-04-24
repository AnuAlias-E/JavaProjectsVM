package com.training.ui;

import java.util.Arrays;

import com.training.model.Employee;
import com.training.model.Manager;
import com.training.model.SalesEmployee;
import com.training.model.comparators.EmployeeBasicSalaryDescendingComparator;

public class Main12 {
public static void main(String[] args) {

	Manager manager = new Manager(101, "Ram", "MALE", "Mumbai", 2000.00, 12);
	SalesEmployee salesEmployee1 = new SalesEmployee(102, "Dinesh", "MALE", "Delhi", 1000.00, 100000.00);
	SalesEmployee salesEmployee2 = new SalesEmployee(103, "Kiran", "MALE", "Pune", 3000.00, 200000.00);
	Employee employee = new Employee(104, "Menaka", "FEMALE", "Cochin", 1500.0);
	Employee[] employees = { manager, salesEmployee1, salesEmployee2, employee };
	EmployeeBasicSalaryDescendingComparator salaryDescendingComparator = new EmployeeBasicSalaryDescendingComparator();
	for (int i = 0; i < employees.length; i++) {

		for (int j = 0; j < employees.length - i - 1; j++) {
		
			int r = salaryDescendingComparator.compare(employees[j],employees[j + 1]);
			if (r > 0) {// when the current item is greater than next
				Employee temp;
				temp = employees[j];
				employees[j] = employees[j + 1];
				employees[j + 1] = temp;
			}
		}
	}
	System.out.println(Arrays.toString(employees));
	employees=null;
}
}
