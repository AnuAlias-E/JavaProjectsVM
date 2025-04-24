package com.training.model;

import java.util.HashSet;
import java.util.Set;

public class Movie {

	int id;
	String name;
	Set<Booking> allBookings;

	public Movie() {
		super();
		this.allBookings = new HashSet<>();

	}

	public Movie(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.allBookings = new HashSet<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Booking> getAllBookings() {
		return allBookings;
	}

	public void setAllBookings(Set<Booking> allBookings) {
		this.allBookings = allBookings;
	}

	@Override
	public String toString() {
		return "\nMovie [id=" + id + ", name=" + name + ", allBookings=" + allBookings + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Movie))
			return false;
		Movie other = (Movie) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public void addBooking(Booking booking) {
		this.allBookings.add(booking);
	}
}
