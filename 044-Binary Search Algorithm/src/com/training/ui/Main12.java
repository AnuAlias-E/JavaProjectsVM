package com.training.ui;

import java.util.Arrays;
import java.util.Comparator;

import com.training.model.Employee;
import com.training.model.Manager;
import com.training.model.SalesEmployee;
import com.training.model.comparators.EmployeeBasicSalaryDescendingComparator;

public class Main12 {

public static void main(String[] args) {
	Manager manager = new Manager(104, "Ram", "MALE", "Mumbai", 5000.00, 12);
	SalesEmployee salesEmployee1 = new SalesEmployee(102, "Dinesh", "MALE", "Delhi",2000.00, 100000.00);
	SalesEmployee salesEmployee2 = new SalesEmployee(103, "Kiran", "MALE", "Pune", 1000.00, 200000.00);
	Employee employee = new Employee(101, "Menaka", "FEMALE", "Cochin", 3000.0);
	Employee[] employees = { manager, salesEmployee1, salesEmployee2, employee };

	System.out.println("Employee Details");
	System.out.println(Arrays.toString(employees));
	System.out.println("---------------------------");
	Arrays.sort(employees,new EmployeeBasicSalaryDescendingComparator());
	System.out.println("Employee Details after sort");
	System.out.println(Arrays.toString(employees));
	System.out.println("---------------------------");
	
	Employee searchObject = new SalesEmployee(104, "Dinesh", "MALE", "Delhi", 3000.00, 100000.00);
	int searchResult = basicDescendingSearch(employees, searchObject);
	if (searchResult == -1)
		System.out.println("Search employee with basic " + searchObject.getBasic()
				+ " is not found and the searchResult is " + searchResult);
	else
		System.out.println(
				"Search  employee with id  " + searchObject.getBasic() + " is present at position : " + searchResult);
	System.out.println("---------------------------");
}

private static int basicDescendingSearch(Employee[] employees, Employee searchObject) {


	Comparator salaryDescendingComparator = new EmployeeBasicSalaryDescendingComparator();
	int low = 0, high = employees.length - 1;
	while (low <= high) {
		int mid = low + (high - low) / 2;
		int r = salaryDescendingComparator.compare(employees[mid], searchObject);
		if (r == 0)
			return mid;

		if (r < 0)
			low = mid + 1;
		else
			high = mid - 1;
	}
	return -1;


}

}
