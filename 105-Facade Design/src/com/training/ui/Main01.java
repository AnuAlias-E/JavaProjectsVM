package com.training.ui;

import com.training.dp.NotificationSystem;
import com.training.dp.PaymentSystem;
import com.training.dp.TicketSystem;
import com.training.dp.User;

public class Main01 {
	public static void main(String[] args) {
		User user = new User("Kiran", "kiran@gmail.com", "73873328111");
		TicketSystem ts = new TicketSystem();
		boolean isBookingAvailable = ts.validateAvailability("movie");
		if (isBookingAvailable) {
			ts.createTicket(10, user, "Movie");
			PaymentSystem ps = new PaymentSystem();
			ps.chargeCard();

			NotificationSystem ns = new NotificationSystem();
			ns.sendEmail(user, ts.getTicketNo());
			ns.sendSMS(user, ts.getTicketNo());

		}
	}
}
