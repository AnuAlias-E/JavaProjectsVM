package com.training.model;

import java.util.LinkedList;
import java.util.List;

public class Department {
	String name;
	String managerName;
	List<Employee> employees;

	public Department(String name, String managerName) {
		super();
		this.name = name;
		this.managerName = managerName;
		this.employees = new LinkedList<>();
	}

	public void addEmployee(int id, String name, String gender, String city, double basic) {
		Employee e = new Employee(id, name, gender, city, basic);
		this.employees.add(e);
	}

	public void printReport() {

		System.out.println("Department Name : " + this.name);
		System.out.println("Manager Name : " + this.managerName);
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");
		System.out.println("Sl No\t\tId\t\tName\t\tGender\t\tCity\t\tBasicSalary\tNetSalary");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");
		int slNo = 1;
		double totalSalary = 0.00;
		int femaleCount = 0, maleCount = 0;

		for (Employee employee : employees) {

			double netSalary = employee.getNetSalary();
			String gender = employee.getGender();
			System.out.println(slNo++ + "\t\t" + employee.getId() + "\t\t" + employee.getName() + "\t\t" + gender
					+ "\t\t" + employee.getCityName() + "\t\t" + employee.getBasic() + "\t\t" + netSalary);

			totalSalary += netSalary;

			if (gender.equalsIgnoreCase("Female")) {
				femaleCount++;
			} else
				maleCount++;
		}
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");

		System.out.println("TOTAL NET SALARY : " + totalSalary);
		System.out.println("FEMALE COUNT : " + femaleCount);
		System.out.println("MALE COUNT : " + maleCount);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public boolean isEmployeePresent(int id) {
		Employee emp = new Employee();
		emp.setId(id);
		boolean result = this.employees.contains(emp);
		return result;

	}

	public Employee findByEmployeeId(int id) {
		Employee emp = new Employee();
		emp.setId(id);
		int indexResult = this.employees.indexOf(emp);
		if (indexResult == -1) {
			return null;
		} else {
			return this.employees.get(indexResult);
		}

	}

	public void updateEmployee(int id, String name, String gender, String city, double basic) {
		Employee emp = new Employee();
		emp.setId(id);
		int indexResult = this.employees.indexOf(emp);
		if (indexResult == -1) {
			System.out.println("Employee not found");
		}
		else {
			Employee temp = new Employee(id, name, gender, city, basic);
			this.employees.set(indexResult, temp);
		}
	}

	public void deleteEmployee(int id) {
		
		Employee emp = new Employee();
		emp.setId(id);
		this.employees.remove(emp);
	}
}
