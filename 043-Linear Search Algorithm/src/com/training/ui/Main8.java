package com.training.ui;

import java.util.Arrays;
import java.util.Comparator;

import com.training.model.Account;
import com.training.model.Employee;
import com.training.model.Manager;
import com.training.model.SalesEmployee;
import com.training.model.comparators.AccountCustomerNameComparator;
import com.training.model.comparators.EmployeeBasicSalaryAscendingCompartor;

public class Main8 {
	public static void main(String[] args) {

		Manager manager = new Manager(104, "Ram", "MALE", "Mumbai", 1000.00, 12);
		SalesEmployee salesEmployee1 = new SalesEmployee(102, "Dinesh", "MALE", "Delhi", 1000.00, 100000.00);
		SalesEmployee salesEmployee2 = new SalesEmployee(103, "Kiran", "MALE", "Pune", 1000.00, 200000.00);
		Employee employee = new Employee(101, "Menaka", "FEMALE", "Cochin", 1000.0);
		Employee[] employees = { manager, salesEmployee1, salesEmployee2, employee };

		System.out.println("Employee Details");
		System.out.println(Arrays.toString(employees));
		System.out.println("---------------------------");
		System.out.println("-----------Using Equals Search----------------");
		Employee searchObject = new SalesEmployee(102, "Dinesh", "MALE", "Delhi", 1000.00, 100000.00);
		int searchResult = search(employees, searchObject);
		if (searchResult == -1)
			System.out.println("Search employee with id " + searchObject.getId()
					+ " is not found and the searchResult is " + searchResult);
		else
			System.out.println(
					"Search  employee with id  " + searchObject.getId() + " is present at position : " + searchResult);
		System.out.println("---------------------------");

		System.out.println("--------------ID Comaparable Search-------------");
		searchObject = new SalesEmployee(103, "Kiran", "MALE", "Pune", 1000.00, 200000.00);
		int idSearchResult = idComparableSearch(employees, searchObject);
		if (idSearchResult == -1)
			System.out.println("Search employee with id " + searchObject.getId()
					+ " is not found and the searchResult is " + idSearchResult);
		else
			System.out.println(
					"Search employee with id  " + searchObject.getId() + " is present at position : " + idSearchResult);
		System.out.println("---------------------------");

		System.out.println("-----------Comparator Search---------------");
		searchObject = new SalesEmployee(103, "Kiran", "MALE", "Pune", 7000.00, 200000.00);
		int basicSearchResult = basicComparatorSearch(employees, searchObject);
		if (basicSearchResult == -1)
			System.out.println("Search employee with basic salary " + searchObject.getBasic()
					+ " is not found and the searchResult is " + basicSearchResult);
		else
			System.out.println("Search employee with basic salary " + searchObject.getBasic()
					+ " is present at position : " + basicSearchResult);
		System.out.println("---------------------------");

	}

	private static int basicComparatorSearch(Employee[] employees, Employee searchObject) {
		Comparator basicComparator = new EmployeeBasicSalaryAscendingCompartor();
		for (int i = 0; i < employees.length; i++) {

			int r = basicComparator.compare(employees[i], searchObject);
			if (r == 0)
				return i;

		}
		return -1;
	}

	private static int idComparableSearch(Employee[] employees, Employee searchObject) {

		for (int i = 0; i < employees.length; i++) {
			if (searchObject instanceof Comparable) {
				Comparable searchData = (Comparable) searchObject;
				int r = employees[i].compareTo(searchObject);
				if (r == 0)
					return i;
			}
		}
		return -1;

	}

	private static int search(Employee[] employees, Employee searchObject) {

		for (int i = 0; i < employees.length; i++) {
			if (employees[i].equals(searchObject))
				return i;
		}
		return -1;

	}
}
