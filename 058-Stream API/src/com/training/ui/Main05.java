package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.model.Employee;
import com.training.model.comparators.EmployeeBasicSalaryAscendingCompartor;
import com.training.model.comparators.EmployeeBasicSalaryDescendingComparator;

public class Main05 {
	public static void main(String[] args) {
		
	
	Employee e1 = new Employee(101, "Anu", "Female", "Mumbai", 1000.00);
	Employee e2 = new Employee(102, "Anju", "Female", "TVM", 30000.00);
	Employee e3 = new Employee(103, "Meera", "Female", "Mumbai", 20000.00);
	Employee e4 = new Employee(104, "Arun", "Male", "Chennai", 7000.00);
	Employee e5 = new Employee(105, "Arjun", "Male", "Pune", 33000.00);
	Employee e6 = new Employee(106, "Meethi", "Female", "Cochin", 9000.00);
	Employee e7 = new Employee(107, "Parvathi", "Female", "TVM", 24000.00);
	Employee e8 = new Employee(108, "Vivek", "Male", "Chennai", 56000.00);
	Employee e9 = new Employee(109, "Sinoj", "Male", "Hyderbad", 11000.00);
	Employee e10 = new Employee(110, "Anna", "Female", "Kochi", 2000.00);
	Employee e11 = new Employee(111, "Alok", "Male", "Chennai", 17000.00);

	List<Employee> employees = new LinkedList<>();
	employees.add(e1);
	employees.add(e2);
	employees.add(e3);
	employees.add(e4);
	employees.add(e5);
	employees.add(e6);
	employees.add(e7);
	employees.add(e8);
	employees.add(e9);
	employees.add(e10);

	employees.add(e11);

	System.out.println("-------------------------------------------------=--------------------------------------");
	//Using Comparator in stream
	
	employees
	.stream()
	.sorted(new EmployeeBasicSalaryAscendingCompartor())
	.forEach(e->System.out.println(e));
	
	System.out.println("-------------------------------------------------=--------------------------------------");
	employees
	.stream()
	.sorted(new EmployeeBasicSalaryDescendingComparator())
	.forEach(e->System.out.println(e));
	
	
	}
}
