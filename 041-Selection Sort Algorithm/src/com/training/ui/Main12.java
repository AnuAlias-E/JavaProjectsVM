package com.training.ui;

import java.util.Arrays;

import com.training.model.Employee;
import com.training.model.Manager;
import com.training.model.SalesEmployee;
import com.training.model.comparators.EmployeeBasicSalaryAscendingCompartor;
import com.training.model.comparators.EmployeeBasicSalaryDescendingComparator;

public class Main12 {
public static void main(String[] args) {

	
	Manager manager = new Manager(104, "Ram", "MALE", "Mumbai", 1300.00, 12);
	SalesEmployee salesEmployee1 = new SalesEmployee(102, "Dinesh", "MALE", "Delhi", 1200.00, 100000.00);
	SalesEmployee salesEmployee2 = new SalesEmployee(103, "Kiran", "MALE", "Pune", 1000.00, 200000.00);
	Employee employee = new Employee(101, "Menaka", "FEMALE", "Cochin", 1100.0);
	Employee[] employees = { manager, salesEmployee1, salesEmployee2, employee };
	
	System.out.println("Before Sort" + Arrays.toString(employees));
	EmployeeBasicSalaryDescendingComparator salaryDescendingComparator = new EmployeeBasicSalaryDescendingComparator();

	int n = employees.length;

	int imin;
	for (int i = 0; i < n - 1; i++) {
		imin = i;
		for (int j = i + 1; j < n; j++) {
			int r = salaryDescendingComparator.compare(employees[j], employees[imin]);
			if (r < 0) {
				imin = j;
			}
		}
		Employee temp;
		temp = employees[i];
		employees[i] = employees[imin];
		employees[imin] = temp;

	}

	System.out.println("After Sort: " + Arrays.toString(employees));
	employees = null;

}
}
