
public class Main7 {
	public static void main(String[] args) {
		int[] array = { 14, 20, 30, 10 };
		// task1
		// find the sum of the elements and print it
		// find the average and print it
		int sum = 0;
		for (int element : array) {
			sum += element;
		}
		System.out.println("The sum is " + sum);
		float average = 0.0f;
		average = sum / array.length;
		System.out.println("The average is " + average);
		array=null;
	}
}
