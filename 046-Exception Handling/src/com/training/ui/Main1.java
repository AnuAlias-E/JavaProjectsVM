package com.training.ui;

public class Main1 {
	public static void main(String[] args) {
		System.out.println("Program Begins.....");
		try {
			System.out.println(Integer.parseInt("abcd"));
		} catch (NumberFormatException e) {
			System.out.println(e);
		} finally {
			System.out.println("Thank you");
			System.out.println("Continuing....");
		}
		System.out.println("Program End....");
	}
}
