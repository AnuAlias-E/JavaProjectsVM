
public class TrainReservationClient {

	public static void main(String[] args) {
		TrainReservation t1=new TrainReservation();
		System.out.println("Booking Tickets");
		t1.name="Anu Alias";
		t1.trainName="Vanchinad";
		t1.noOfTickets=4;
		t1.price=75.00;
		t1.bookTickets();
		
		
		System.out.println("******************");
		System.out.println("Canceling Tickets");
		t1.cancelTickets();
		
		System.out.println("******************");
		
		TrainReservation t2= new TrainReservation();
		System.out.println("Booking Tickets");
		t2.name="Ranju";
		t2.trainName="Parsuram";
		t2.noOfTickets=8;
		t2.price=150;
		t2.bookTickets();

	}

}
