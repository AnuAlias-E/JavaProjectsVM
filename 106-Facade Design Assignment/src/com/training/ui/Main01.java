package com.training.ui;

import com.training.dp.FoodArrangement;
import com.training.dp.HotelBooking;
import com.training.dp.TravelArrangements;

public class Main01 {
	public static void main(String[] args) {
		HotelBooking hotelBooking = new HotelBooking();
		boolean roomsAvailable = hotelBooking.roomsAvailable(10);
		if (roomsAvailable) {
			String roomBooked = hotelBooking.bookRooms(10, 5);
			System.out.println("Room Booking: " + roomBooked);
			System.out.println("------------------------------------------------------");
			if (roomBooked.equalsIgnoreCase("Success Booking")) {
				double costForHotelBooking = hotelBooking.chargeForBooking();
				System.out.println("Cost Of Hotel Booking: " + costForHotelBooking);
				System.out.println("------------------------------------------------------");
				TravelArrangements traArrangement = new TravelArrangements();
				traArrangement.arrange(10);
				System.out.println("------------------------------------------------------");
				FoodArrangement foodArrangement = new FoodArrangement();
				double foodCost = foodArrangement.arrangeFood(10);
				System.out.println("Cost of Food : " + foodCost);
			}
		}
	}
}
