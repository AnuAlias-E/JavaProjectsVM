package com.training.dp;

public class RichBudgetTourArrangement extends TourArrangement {

	@Override
	public double bookHotel(int personCount) {
		System.out.println("Because of rich budget, Booking 5 star hotel");
		double cost = 5000.00;
		return cost * personCount;
	}

	@Override
	public double arrangeTransport(int personCount) {
		System.out.println("Because of rich budget, Flights are arranged");
		double cost = 6000.00;
		return cost * personCount;
	}

	@Override
	public double arrangeFood(int personCount) {
		System.out.println("Because of rich budget, Non veg Food arranged");
		double cost = 2000.00;
		return cost * personCount;
	}

}
