import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		int currentQuantity;
		/**
		 * currentQuantity==10 Print Stock Level Very Low currentQuantity==20 Print
		 * Stock Level Low currentQuantity==30 Print Stock Level Low currentQuantity==50
		 * Print Stock Level Ok Default Print Invalid Stock Level
		 */

		final int ten = 10;
		final int twenty = 20;
		final int thirty = 30;
		final int fifty = 50;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the current quantity");
		currentQuantity = sc.nextInt();
		
		switch (currentQuantity) {
		case ten:
			System.out.println("Stock Level Very Low");
			break;
		case twenty:
			System.out.println("Stock Level Low");
			break;
		case thirty:
			System.out.println("Stock Level Low");
			break;
		case fifty:
			System.out.println("Stock Level Ok");
			break;
		default:
			System.out.println("Invalid Stock Level");
			break;
	
		}
	
	}
}
