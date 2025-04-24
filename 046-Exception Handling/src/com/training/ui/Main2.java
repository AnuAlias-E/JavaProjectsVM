package com.training.ui;

public class Main2 {
	static void printLength(String str) {
		System.out.println("printLength() method Begins.....");
		try {
		System.out.println(str.length());
		}catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Continuing....");
		}finally {
			System.out.println("Thank you ");
		}
		System.out.println("printLength() method ends.....");

	}
public static void main(String[] args) {
	System.out.println("Program Begins.....");
	
	String s1="Welcome";
	String s2=null;
	String s3="UST";
	printLength(s1);
	printLength(s2);
	printLength(s3);
	System.out.println("Program Ends.....");
}
}
