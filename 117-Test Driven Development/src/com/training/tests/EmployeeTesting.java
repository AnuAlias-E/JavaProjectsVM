package com.training.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.model.Employee;


public class EmployeeTesting {
	Employee employee;

	@BeforeEach
	public void setup() {
		employee = new Employee();
	}

	@AfterEach
	public void tearDown() {
		employee = null;
	}

	@Test
	@DisplayName("A Grade Testing")
	public void employeeAGradeTesting() {
		employee.setGrade('A');
		int expected = 40;
		int actual = this.employee.getIncentivePercentage();
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("B Grade Testing")
	public void employeeBGradeTesting() {
		employee.setGrade('B');
		int expected = 30;
		int actual = this.employee.getIncentivePercentage();
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("C Grade Testing")
	public void employeeCGradeTesting() {
		employee.setGrade('C');
		int expected = 20;
		int actual = this.employee.getIncentivePercentage();
		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("D Grade Testing")
	public void employeeDGradeTesting() {
		employee.setGrade('D');
		int expected = 10;
		int actual = this.employee.getIncentivePercentage();
		assertEquals(expected, actual);
	}

}
