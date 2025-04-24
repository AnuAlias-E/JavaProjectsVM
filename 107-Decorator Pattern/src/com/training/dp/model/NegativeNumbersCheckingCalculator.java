package com.training.dp.model;

public class NegativeNumbersCheckingCalculator implements Calculator {
	Calculator calculator;

	public NegativeNumbersCheckingCalculator(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	@Override
	public int add(int a, int b) {
		if (this.calculator == null) {
			return a + b;
		} else {
			if (a < 0 || b < 0) {
				System.out.println("Negative Numbers Found");
				return 0;
			} else {
				int r = calculator.add(a, b);
				return r;
			}

		}
	}

}
