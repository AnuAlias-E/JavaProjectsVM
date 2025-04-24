import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		int qty;
		// Take input for qty from the user at run time
		// qty>=90 print "*****"
		// qty>= 70 and <90 print "****"
		// qty >=50 and 70 print ***
		// qty<50 and print "**"

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the quantity");
		qty = sc.nextInt();

		if (qty >= 90)
			System.out.println("*****");
		else if (qty >= 70 )
			System.out.println("****");

		else if (qty >= 50 )
			System.out.println("***");
		else
			System.out.println("**");
	}
}
