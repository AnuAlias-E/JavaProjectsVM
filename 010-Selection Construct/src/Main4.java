
public class Main4 {
	public static void main(String[] args) {
		int marks;
		marks = 66;
		char grade;
		if (marks >= 90) {
			grade = 'A';
			System.out.println("You are eligble for scholarship");
		} else if (marks >= 70) {
			grade = 'B';
			System.out.println("You are eligible for scholarship");
		} else if (marks >= 50) {
			grade = 'C';
			System.out.println("you are not eligible for scholarship");
		} else {
			grade = 'D';
			System.out.println("you are not eligible for scholarship");
		}
		System.out.println(grade);
	}
}
