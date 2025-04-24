package com.training.ui;

import com.training.model.Guest;
import com.training.model.Hotel;

public class Main01 {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.addRoom(2, 20, 30);
		hotel.addRoom(4, 120, 180);
		hotel.addRoom(3, 40, 80);

		Guest guest1 = new Guest("Kiran", "1272367", "Indian", "Male");
		Guest guest2 = new Guest("Ram", "345667", "American", "Male");
		Guest guest3 = new Guest("Menaka", "65767", "Italian", "Female");
		hotel.addGuest(guest1);
		hotel.addGuest(guest2);
		hotel.addGuest(guest3);
		System.out.println("---------------------Hotel And Guest Details----------------------------");
		System.out.println(hotel);
		System.out.println("-------------------------------------------------------------------------");
		hotel.allocateRoom(guest1);
		System.out.println("-------------------------------------------------------------------------");

		hotel.allocateRoom(guest2);
		System.out.println("-------------------------------------------------------------------------");

		hotel.allocateRoom(guest3);

	}
}
