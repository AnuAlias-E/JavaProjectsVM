package com.training.dp;

public class LowBudgetTourArrangement extends TourArrangement {

	@Override
	public double bookHotel(int personCount) {
		System.out.println("Because of low budget, Booking Simple hotel");
		double costPerPerson = 500.00;
		return costPerPerson * personCount;
	}

	@Override
	public double arrangeTransport(int personCount) {
		System.out.println("Because of low budget , arranging simple transport");
		double ticketCost = 300.00;
		return ticketCost * personCount;
	}

	@Override
	public double arrangeFood(int personCount) {
		System.out.println("Because of low budget , arranging Veg Food");
		double cost = 100.00;
		return cost * personCount;
	}

}
