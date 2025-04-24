package com.training.dp;

public abstract class TourArrangement {

	public final double arrangeTour(int personCount) {
		double cost = bookHotel(personCount);
		cost += arrangeTransport(personCount);
		cost += arrangeFood(personCount);
		return cost;

	}

	public abstract double bookHotel(int personCount);

	public abstract double arrangeTransport(int personCount);

	public abstract double arrangeFood(int personCount);
}
