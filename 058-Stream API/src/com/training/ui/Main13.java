package com.training.ui;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.training.model.Employee;

public class Main13 {
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
		Employee e10 = new Employee(110, "Anna", "Female", "Cochin", 2000.00);
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

		List<Employee> maleEmps = employees.stream().sorted().filter(e -> e.getGender().equalsIgnoreCase("male"))
				.collect(Collectors.toList());

		System.out.println(maleEmps);

		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		List<String> empNameList = employees.stream().map(e -> e.getName()).collect(Collectors.toList());

		System.out.println(empNameList);

		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		List<Double> allBasicSalary = employees.stream().map(e -> e.getBasic()).collect(Collectors.toList());

		System.out.println(allBasicSalary);

		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		List<String> allCities = employees.stream().map(e -> e.getCityName().toUpperCase()).distinct()
				.collect(Collectors.toList());
		System.out.println(allCities);

		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		double totalSalary = employees.stream().collect(Collectors.summingDouble(e -> e.getBasic()));
		System.out.println(totalSalary);
		System.out.println(
				"--------------------------------------------------------------------------------------------------");
//Method Reference
		totalSalary = employees.stream().collect(Collectors.summingDouble(Employee::getBasic));
		System.out.println(totalSalary);

		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		String result = employees.stream().map(e -> e.getName()).collect(Collectors.joining(","));

		System.out.println(result);

		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		result = employees.stream().map(Employee::getName).collect(Collectors.joining(" "));

		System.out.println(result);

		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		Map<String, List<Employee>> map1 = employees.stream().collect(Collectors.groupingBy(Employee::getCityName));
		// System.out.println(map1);

		System.out.println(
				"--------------------------------------------------------------------------------------------------");
		for (Map.Entry<String, List<Employee>> entry : map1.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(
					"--------------------------------------------------------------------------------------------------");
			List<Employee> empList = entry.getValue();
			for (Employee e : empList) {
				System.out.println(e.toString());
			}

		}
		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		Map<String, Long> map2;
		map2 = employees.stream().collect(Collectors.groupingBy(Employee::getCityName, Collectors.counting()));
		System.out.println(map2);

		System.out.println(
				"--------------------------------------------------------------------------------------------------");
		Map<String, Double> map3;
		map3 = employees.stream()
				.collect(Collectors.groupingBy(Employee::getCityName, Collectors.summingDouble(Employee::getBasic)));
		System.out.println(map3);

		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		Map<Integer, String> map4;
		map4 = employees.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
		System.out.println(map4);

		System.out.println(
				"--------------------------------------------------------------------------------------------------");
		employees.stream().forEach(System.out::println);
	}
}
