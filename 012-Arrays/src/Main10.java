import java.util.Arrays;

public class Main10 {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3 };// inline
		int[] array2 = new int[3];// default
		int[] array3 = new int[] { 5, 6, 4, 7 };// with valuee

		byte b1 = 10;
		short s1 = 20;
		int i1 = 100;
		char ch1 = 'A';
		long l1 = 800;
		double d1 = 80.00;
		int[] array4 = { b1, s1, i1, ch1, (int) l1, (int) d1 };// showing error if we didnt type cast for long and
																// double variables
		String str = "[";
		for (int element : array4) {
			str = str + element + " ";

		}
		str = str + "]";
		System.out.println(str);

		str = "[";
		for (int i = 0; i < array4.length; i++) {
			if (i == array4.length - 1)
				str = str + array4[i];
			else {
				str = str + array4[i] + ",";
			}

		}
		str = str + "]";
		System.out.println(str);
		System.out.println(Arrays.toString(array4));
		array4 = null;

	}

}
