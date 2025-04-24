package com.training.model;

public class Employee {
public double basicSalary;

@Override
public String toString() {
	return "Employee [basicSalary=" + basicSalary + "]";
}

public double getAllowance() {
	double result=0;
	int x=0;
	class Calculator{//Method Local Inner Class
		public double add (double a,double b) {
			System.out.println(x);
			System.out.println(basicSalary);
			return a+b;
		}
		public double subtract (double a,double b) {
			return a-b;
		}
		public double multiply (double a,double b) {
			return a*b;
		}
		public double divide (double a,double b) {
			return a/b;
		}
	}
	
	Calculator calculator = new Calculator();
	result=calculator.multiply(basicSalary, 0.35);
	return result;
}
}
