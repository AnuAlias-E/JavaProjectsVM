package com.training.ui;

import java.time.LocalDate;
import java.util.List;

import com.training.model.Booking;
import com.training.model.CommonData;
import com.training.model.Movie;
import com.training.model.Person;

public class Main {
	static List<Movie> movies = CommonData.movies;
	static List<Person> persons = CommonData.persons;

	public static void main(String[] args) {
		CommonData.init();
		bookTicket(4, 2);
		bookTicket(1, 3);
		bookTicket(3, 4);
		bookTicket(1, 4);
		bookTicket(1, 2);
		bookTicket(1, 1);
		bookTicket(3, 1);
		printBooking();

		cancelBooking(1, 4);
		printBooking();
	}

	private static void bookTicket(int movieIndex, int personIndex) {
		Booking booking = new Booking((int) (Math.random() * 100), movies.get(movieIndex), persons.get(personIndex),
				LocalDate.of(2025, 05, 01), false);
		CommonData.bookings.add(booking);
		movies.get(movieIndex).addBooking(booking);
	}

	private static void printBooking() {
		for (Movie movie : movies) {
			System.out.print(movie.getName());
			for (Booking booking : movie.getAllBookings()) {
				if(!booking.isCancelStatus()) {
				System.out.print("\t\t" + booking.getPerson().getName());
				}
			}
			System.out.println();
		}
	}

	private static void cancelBooking(int movieIndex, int personIndex) {
		Movie movie = movies.get(movieIndex);
		Person person = persons.get(personIndex);
		List<Booking> bookings = CommonData.bookings;
		for (Booking booking : bookings) {
			if (booking.getMovie().equals(movie) && booking.getPerson().equals(person)) {
				booking.setCancelStatus(true);
			}
		}

	}

}
