package com.training.ui;

import java.util.Arrays;

public class Main2 {
	public static void main(String[] args) {
		double[] prices = { 20.0, 14.0, 12.0, 8.0, 15.33 };
		System.out.println("Before Sort: " + Arrays.toString(prices));
		int n = prices.length;

		int imin;
		for (int i = 0; i < n - 1; i++) {
			imin = i;
			for (int j = i + 1; j < n; j++) {
				if (prices[j] < prices[imin]) {
					imin = j;
				}
			}
			double temp;
			temp = prices[i];
			prices[i] = prices[imin];
			prices[imin] = temp;

		}

		System.out.println("A Sort: " + Arrays.toString(prices));
		prices = null;
	}
}
