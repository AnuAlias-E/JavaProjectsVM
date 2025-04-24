import java.util.Arrays;

public class Client2 {

	public static void test2(int[] x) {
		System.out.println("In test2 before changes " + Arrays.toString(x));
		x[0]=++x[0];
		x[1]=++x[1];
		x[2]=++x[2];
		
		System.out.println("In test2 after changes " + Arrays.toString(x));
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 20, 30 };
		System.out.println("Main before function call " + Arrays.toString(arr));
		test2(arr);
		System.out.println("Main after function call " + Arrays.toString(arr));
	}

}
