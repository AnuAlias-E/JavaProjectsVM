
public class TrainReservation {
	
	String name;
	String trainName;
	int noOfTickets;
	double price;
	
	double calculateTicketPrice() {
		return noOfTickets*price;
	}

	void bookTickets() {
		System.out.println("Tickets Booked for the following person" );
		showDetails();
		
	}
	
	void cancelTickets() {
		System.out.println("Tickets Canceled for the following person " );
		showDetails();
		
	}

	 void showDetails() {
		System.out.println("Name Of the person : "+name);
		System.out.println("Train Name: " +trainName);
		System.out.println("No of tickets : "+noOfTickets);
		System.out.println("Ticket Price :"+calculateTicketPrice());
	}
	
}
