package com.training.task;

import java.util.LinkedList;
import java.util.List;

public class FlightDeparturesPrintingTask implements Runnable {

	@Override
	public void run() {
		List<String> departures = new LinkedList<>();
		departures.add("Chennai-Delhi 12:20 PM");
		departures.add("Goa-Bangalore 10:45 PM");
		departures.add("Delhi-Kolkatta 11:20 AM");
		departures.add("Bangalore-Cochin 5:20 AM");
		departures.add("Trivandrum-Chennai 6:20 AM");
		String name = Thread.currentThread().getName();
		for (int i = 0; i < departures.size(); i++) {
			System.out.println("\t" + name + " : " + departures.get(i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i == departures.size() - 1) {
				i = 0;
			}
		}

	}

}
