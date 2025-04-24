package com.training.ui;

public class Main05 {

	public static void main(String[] args) {
		System.out.println("Program Begins.....");
		try {
		System.out.println(100/3);
		int []arr= {1,2,3,4,5};
		System.out.println(arr[4]);
		System.out.println(Integer.parseInt("124"));
		String str="hello world";
		System.out.println(str.length());
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid Division");System.out.println("Continuing.....");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("Continuing.....");
		}
		catch (NumberFormatException e) {
			System.out.println("Invalid string Data ..");
			System.out.println("Continuing.....");
		}
		catch (NullPointerException e) {
			System.out.println("Null value encountered");
			System.out.println("Continuing.....");
		}
		catch (RuntimeException e) {
			System.out.println("Some Error Occured: "+e);
			System.out.println("Continuing.....");
		}
		System.out.println("Program End....");
	}



}
