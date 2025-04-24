package com.training.model;

import java.time.LocalDate;

public class Booking {
	int bookingId;
	Movie movie;
	Person person;
	LocalDate showDate;
	boolean cancelStatus;
	
	public Booking(int bookingId,Movie movie, Person person, LocalDate showDate,boolean cancelStatus) {
		super();
		this.bookingId=bookingId;
		this.movie = movie;
		this.person = person;
		this.showDate = showDate;
		this.cancelStatus=cancelStatus;
	}
	public Booking() {
		super();
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public LocalDate getShowDate() {
		return showDate;
	}
	public void setShowDate(LocalDate showDate) {
		this.showDate = showDate;
	}
	
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public boolean isCancelStatus() {
		return cancelStatus;
	}
	public void setCancelStatus(boolean cancelStatus) {
		this.cancelStatus = cancelStatus;
	}
	@Override
	public String toString() {
		return "Booking [movie=" + movie + ", person=" + person + ", showDate=" + showDate + ", cancelStatus="
				+ cancelStatus + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookingId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Booking))
			return false;
		Booking other = (Booking) obj;
		if (bookingId != other.bookingId)
			return false;
		return true;
	}
	
	
}
