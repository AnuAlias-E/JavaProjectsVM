import java.util.Arrays;

public class Main9 {
	public static void main(String[] args) {
		int[] array = { 14, 20, 30, 10 };
		// task3
		// Print the elemnts in reverse order
		System.out.println("The elements are ");
		for (int element : array) {
			System.out.println(element);
		}
		System.out.println("The reverse order is");
		for (int i = array.length-1; i >=0; i--) {
			System.out.println(array[i]);
		}
	}
}
