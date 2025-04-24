import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		int mark1, mark2;
		// take input as mark1 and mark2
		float average;
		char grade;
		// compute average;
		/**
		 * avg 80-100 grade is A print message Scholarship is 50000.00 avg 60-79 grade
		 * is B * print message Scholarship is 40000.00 avg 40-59 grade is C * print
		 * message Scholarship is 30000.00 avg 0-39 grade is D * print message
		 * Scholarship is 0.00
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark1");
		mark1 = sc.nextInt();
		System.out.println("Enter the mark2");
		mark2 = sc.nextInt();

		average = (mark1 + mark2) / 2.0f;
		if (average >= 80) {
			grade = 'A';
			System.out.println("Grade is " + grade);
		} else if (average >= 60) {
			grade = 'B';
			System.out.println("Grade is " + grade);
		} else if (average >= 40) {
			grade = 'C';
			System.out.println("Grade is " + grade);
		} else {
			grade = 'D';
			System.out.println("Grade is " + grade);
		}

		if (grade == 'A')
			System.out.println("Scholarship is Rs.50000.00");
		else if (grade == 'B')
			System.out.println("Scholarship is Rs.40000.00");
		else if (grade == 'C')
			System.out.println("Scholarship is Rs.30000.00");
		else if (grade == 'D')
			System.out.println("Scholarship is Rs.0.00");
	}
}
