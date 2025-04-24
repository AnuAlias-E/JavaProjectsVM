import java.util.Arrays;

public class Client4 {
	public static void test1(int... x) {
		System.out.println(Arrays.toString(x));
	}

/**OR
 *int [] x same as ...
 	public static void test1(int [] x) {
		System.out.println(Arrays.toString(x));
	}*/
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		test1(arr1);
		System.out.println("----------------------");
		int[] arr2 = new int[] { 10, 20, 30, 40, 50 };
		test1(arr2);
		System.out.println("----------------------");
		int[] arr3 = {};
		test1(arr3);
		System.out.println("----------------------");
		test1(80,90,30,200,10);
		System.out.println("----------------------");
		test1(new int[] {4,5,6,7});
		System.out.println("----------------------");
		test1(2,5);
		System.out.println("----------------------");
		test1();
	}
}
