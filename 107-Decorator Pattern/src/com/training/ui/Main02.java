package com.training.ui;

import com.training.dp.model.Calculator;
import com.training.dp.model.MessageCalculator;
import com.training.dp.model.NegativeNumbersCheckingCalculator;
import com.training.dp.model.SimpleCalculator;

public class Main02 {
	public static void main(String[] args) {
		Calculator calculator = new SimpleCalculator(null);
		/// System.out.println(calculator.add(10, 5));
		NegativeNumbersCheckingCalculator nc = new NegativeNumbersCheckingCalculator(calculator);
		// System.out.println(nc.add(10, 6));

		MessageCalculator mc = new MessageCalculator(nc);
		System.out.println(mc.add(10, -5));

	}
}
