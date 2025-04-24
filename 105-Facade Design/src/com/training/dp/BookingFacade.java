package com.training.dp;

public class BookingFacade {
	public void createBooking(User user) {
		TicketSystem ts = new TicketSystem();
		PaymentSystem ps = new PaymentSystem();
		NotificationSystem ns = new NotificationSystem();
		boolean isBookingAvailable = ts.validateAvailability("Movie");
		if (isBookingAvailable) {
			ts.createTicket(101, user, "Movie");
			ps.chargeCard();

			ns.sendEmail(user, ts.getTicketNo());
			ns.sendSMS(user, ts.getTicketNo());
		}

	}
}
