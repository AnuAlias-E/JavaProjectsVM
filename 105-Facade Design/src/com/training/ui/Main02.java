package com.training.ui;

import com.training.dp.BookingFacade;
import com.training.dp.User;

public class Main02 {
	public static void main(String[] args) {
		User user = new User("Kiran", "kiran@gmail.com", "73873328111");
		BookingFacade bookingFacade = new BookingFacade();
		bookingFacade.createBooking(user);
	}
}
