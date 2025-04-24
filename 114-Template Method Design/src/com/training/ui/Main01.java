package com.training.ui;

import com.training.dp.LowBudgetTourArrangement;
import com.training.dp.MediumBudgetTourArrangement;
import com.training.dp.RichBudgetTourArrangement;
import com.training.dp.TourArrangement;

public class Main01 {
	public static void main(String[] args) {
		TourArrangement arrangement = new LowBudgetTourArrangement();
		double totalcost = arrangement.arrangeTour(10);
		System.out.println(totalcost);

		arrangement = new RichBudgetTourArrangement();
		totalcost = arrangement.arrangeTour(10);
		System.out.println(totalcost);

		arrangement = new MediumBudgetTourArrangement();
		totalcost = arrangement.arrangeTour(10);
		System.out.println(totalcost);
	}
}
