package com.training.dp;

public class MediumBudgetTourArrangement extends TourArrangement {

	@Override
	public double bookHotel(int personCount) {
		System.out.println("Because of medium budget, Booking 3 star hotel");
		double cost = 2500.00;
		return cost * personCount;
	}

	@Override
	public double arrangeTransport(int personCount) {
		System.out.println("Because of medium budget, Train is arranged");
		double cost = 2000.00;
		return cost * personCount;
	}

	@Override
	public double arrangeFood(int personCount) {
		System.out.println("Because of medium budget, Veg Food and Egg arranged");
		double cost = 800.00;
		return cost * personCount;
	}

}
