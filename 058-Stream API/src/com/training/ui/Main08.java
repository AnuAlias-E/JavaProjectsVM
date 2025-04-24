package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.model.Employee;

public class Main08 {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Anu", "Female", "Mumbai", 1000.00);
		Employee e2 = new Employee(102, "Anju", "Female", "TVM", 30000.00);
		Employee e3 = new Employee(103, "Meera", "Female", "Mumbai", 20000.00);
		Employee e4 = new Employee(104, "Arun", "Male", "Chennai", 1000.00);
		Employee e5 = new Employee(105, "Arjun", "Male", "Pune", 33000.00);
		Employee e6 = new Employee(106, "Meethi", "Female", "Cochin", 1000.00);
		Employee e7 = new Employee(107, "Parvathi", "Female", "Cochin", 24000.00);
		Employee e8 = new Employee(108, "Vivek", "Male", "Chennai", 56000.00);
		Employee e9 = new Employee(109, "Sinoj", "Male", "Hyderbad", 1000.00);
		Employee e10 = new Employee(110, "Anna", "Female", "Cochin", 2000.00);
		Employee e11 = new Employee(111, "Alok", "Male", "Chennai", 1000.00);

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

		
		long maleEmpCount = employees
				.stream()
				.filter(e -> e.getGender().equalsIgnoreCase("Male"))
				.count();

		System.out.println("Male Employee Count: "+maleEmpCount);
		
		long cochinEmpCount = employees
				.stream()
				.filter(e -> e.getCityName().equalsIgnoreCase("cochin"))
				.count();

		System.out.println("Cochin Location Employee Count: "+cochinEmpCount);
		
		long basicSalAboveCount = employees
				.stream()
				.filter(e -> e.getBasic()>=25000)
				.count();

		System.out.println("Basic Salary above 25000 Employee Count: "+basicSalAboveCount);
	}
}
