import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		int[] marks;
		int size;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		size = sc.nextInt();
		marks = new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();
		}
		for (int mark : marks) {
			System.out.println(mark);
		}
	}
}
