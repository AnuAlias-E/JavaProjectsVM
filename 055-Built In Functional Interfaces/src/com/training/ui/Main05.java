package com.training.ui;

import java.util.function.Function;

import com.training.model.Circle;
import com.training.model.Employee;
import com.training.model.Payment;
import com.training.model.Square;

public class Main05 {
	public static void main(String[] args) {
		Function<Integer, Circle> function1;
		function1 = (Integer i) -> {
			return new Circle(10);
		};
		Circle c = function1.apply(5);
		System.out.println(c);

		Function<Integer, Square> function2;
		function2 = (Integer i) -> {
			return new Square(10);
		};
		Square s = function2.apply(6);
		System.out.println(s);

		Employee emp = new Employee(120, "Anu", "Female", "TVM", 3000.00);

		Function<Employee, String> function3;
		function3 = e -> e.getName();
		String eName = function3.apply(emp);
		System.out.println(eName);

		Function<Employee, String> function4;
		function4 = e -> e.getCityName();
		String eCityName = function4.apply(emp);
		System.out.println(eCityName);

		Function<Employee, Double> function5;
		function5 = e -> e.getBasic();
		Double eBasic = function5.apply(emp);
		System.out.println(eBasic);

		Payment payment = new Payment("DECEMBER", 20000.00);
		Function<Payment, String> function6;
		function6 = p -> p.getMonth();
		String payMonth = function6.apply(payment);
		System.out.println(payMonth);

		Function<Payment, Double> function7;
		function7 = p -> p.getPaymentAmount();
		Double paymentAmount = function7.apply(payment);
		System.out.println(paymentAmount);

	}
}
