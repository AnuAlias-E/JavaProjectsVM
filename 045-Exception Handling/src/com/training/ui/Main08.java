package com.training.ui;

public class Main08 {

	public static void main(String[] args) {
		System.out.println("Program Begins.....");
		try {
			System.out.println(100 / 3);
			int[] arr = { 1, 2, 3, 4, 5 };
			System.out.println(arr[4]);
			System.out.println(Integer.parseInt("12fgf"));
			String str = null;
			System.out.println(str.length());
		} catch (NumberFormatException | NullPointerException | ArithmeticException
				| ArrayIndexOutOfBoundsException e) {
			if (e instanceof NumberFormatException)
				System.out.println("Number format is invalid");
			if (e instanceof NullPointerException)
				System.out.println("Null value encountered");
			if (e instanceof ArithmeticException)
				System.out.println("Division by zero is not possible");
			if (e instanceof ArrayIndexOutOfBoundsException)
				System.out.println("Please check the array size");
		}

		finally {
			System.out.println("Good Bye");
		}
		System.out.println("Program End....");
	}

}
