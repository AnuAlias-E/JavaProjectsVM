package com.training.model;

import java.util.LinkedList;
import java.util.List;

public class Hotel {

	private List<Room> roomList;
	private List<Guest> guests;
	private List<Stay> stayList;

	public void addRoom(int maxGuests, int width, int height) {
		if (roomList == null)
			roomList = new LinkedList<>();
		roomList.add(new Room(maxGuests, width, height));

	}

	public void addGuest(Guest guest) {
		if (guests == null)
			guests = new LinkedList<>();
		guests.add(guest);
	}

	public void allocateRoom(Guest guest) {
		if (this.stayList == null)
			this.stayList = new LinkedList<>();
		Stay stay = new Stay(7, guest, roomList.get(0));
		this.stayList.add(stay);
		System.out.println("\nAllocated Room : " + stay);
	}

	public void orderFood(Guest guest, String itemName, int qty) {
		// this.stayList.get(0).foodOrders.add(new Stay.FoodOrder(itemName, qty));
	}

	@Override
	public String toString() {
		return "\nHotel [\nroomList=" + roomList + "\nguests=" + guests + "]";
	}

	private class Room {
		private int maxGuests;
		private int width;
		private int height;

		public Room(int maxGuests, int width, int height) {
			super();
			this.maxGuests = maxGuests;
			this.width = width;
			this.height = height;
		}

		@Override
		public String toString() {
			return "\nRoom [maxGuests=" + maxGuests + ", width=" + width + ", height=" + height + "]";
		}

	}

	public class Stay {
		private int noOfDays;
		Guest guest;
		Room room;
		List<FoodOrder> foodOrders;

		public Stay() {
			super();
		}

		public Stay(int noOfDays, Guest guest, Room room) {
			super();
			this.noOfDays = noOfDays;
			this.guest = guest;
			this.room = room;
		}

		@Override
		public String toString() {
			return "\nStay [noOfDays=" + noOfDays + ", guest=" + guest + ", room=" + room + "]";
		}

		private class FoodOrder {
			String itemName;
			int quantity;

			public FoodOrder(String itemName, int quantity) {
				super();
				this.itemName = itemName;
				this.quantity = quantity;
			}

		}
	}

}
