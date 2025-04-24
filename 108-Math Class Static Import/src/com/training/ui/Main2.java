package com.training.ui;

import static java.lang.Math.cbrt;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.random;

import java.util.Random;

public class Main2 {
	public static void main(String[] args) {
		double result1 = min(24.0, 44.0);
		System.out.println(result1);
		double result2 = max(24.0, 44.0);
		System.out.println(result2);

		System.out.println(cbrt(8));
		// Generate random numbers
		System.out.println((int) (random() * 10));
		Random random = new Random();
		System.out.println(random.nextInt(100));
	}
}
