package com.training.dp.model;

public class MessageCalculator implements Calculator {
	Calculator calculator;

	public MessageCalculator(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	@Override
	public int add(int a, int b) {
		if (this.calculator == null) {
			return 0;
		} else {
			System.out.println("Welcome");
			int r = this.calculator.add(a, b);
			System.out.println("Thank You");
			return r;
		}
	}
}
