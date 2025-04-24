package com.training.dp;

public class FoodArrangement {
	public double arrangeFood(int numberOfPersons) {
		System.out.println("Arranging food for " + numberOfPersons);
		double cost = 450.00 * numberOfPersons;
		return cost;

	}
}
