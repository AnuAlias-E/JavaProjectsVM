package com.training.ui;

import com.training.model.Tester;

public class Main07 {
	public static void main(String[] args) {
		Tester<String> tester1;
		tester1 = s -> s.length() > 10;
		System.out.println(tester1.test("Welcome to UST"));

		Tester<Integer> tester2;
		tester2 = i -> i % 2 == 0;
		System.out.println(tester2.test(45));

		Tester<Double> tester3;
		tester3 = d -> d >= 5000;

		System.out.println(tester3.test(6000.00));
	}
}
