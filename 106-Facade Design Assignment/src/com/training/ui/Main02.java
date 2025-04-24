package com.training.ui;

import com.training.dp.TripBookingFacade;

public class Main02 {
	public static void main(String[] args) {
		TripBookingFacade bookingFacade = new TripBookingFacade();
		bookingFacade.createBooking(10, 5);
	}
}
