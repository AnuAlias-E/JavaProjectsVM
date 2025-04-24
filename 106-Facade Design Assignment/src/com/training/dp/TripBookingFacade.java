package com.training.dp;

public class TripBookingFacade {

	public void createBooking(int numberOfPersons, int numberOfDays) {
		HotelBooking hotelBooking = new HotelBooking();
		TravelArrangements traArrangement = new TravelArrangements();
		FoodArrangement foodArrangement = new FoodArrangement();

		boolean roomsAvailable = hotelBooking.roomsAvailable(numberOfPersons);
		if (roomsAvailable) {
			String roomBooked = hotelBooking.bookRooms(numberOfPersons, numberOfDays);
			System.out.println("Room Booking: " + roomBooked);
			System.out.println("------------------------------------------------------");
			if (roomBooked.equalsIgnoreCase("Success Booking")) {
				double costForHotelBooking = hotelBooking.chargeForBooking();
				System.out.println("Cost Of Hotel Booking: " + costForHotelBooking);
				System.out.println("------------------------------------------------------");
				traArrangement.arrange(numberOfPersons);
				System.out.println("------------------------------------------------------");
				double foodCost = foodArrangement.arrangeFood(numberOfPersons);
				System.out.println("Cost of Food : " + foodCost);
			}
		}
	}
}
