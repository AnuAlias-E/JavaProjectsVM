package com.training.ui;

import java.util.Arrays;

public class Main2 {
public static void main(String[] args) {
	double[] prices = { 20.0, 14.0, 12.0, 8.0, 15.33,6.27,55.00 };
	System.out.println("Before Sort: " + Arrays.toString(prices));
	int n = prices.length;
	
	for (int i = 1; i < n; i++) {
		double key = prices[i];
		int j = i - 1;

		while (j >= 0 && prices[j] > key) {
			prices[j + 1] = prices[j];
			j = j - 1;
		}
		prices[j + 1] = key;

	}
	System.out.println("After Sort" + Arrays.toString(prices));
}
}
