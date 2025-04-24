package com.training.ui;
//Arithmetic Exception
public class Main01 {
	public static void main(String[] args) {
		
		System.out.println("Program Begins.....");
		int a = 100, b = 0;
		try {
		int c = a / b;
		System.out.println(c);
		}catch (ArithmeticException e) {
			System.out.println("You cannot divide an integer by zero");
			System.out.println("Continuing.....");
		}
		System.out.println("Program End....");
	}
}
