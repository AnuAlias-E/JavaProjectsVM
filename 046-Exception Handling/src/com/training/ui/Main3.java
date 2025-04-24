package com.training.ui;

public class Main3 {
	static void calculate(int a,int b) {
		System.out.println("calculate() method Begins.....");
		try {
		System.out.println(a/b);
		}catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Continuing....");
		}finally {
			System.out.println("Thank you ");
		}
		System.out.println("calculate() method ends.....");

	}
public static void main(String[] args) {
	System.out.println("Program Begins.....");
	
	
	calculate(20,10);
	calculate(20,0);
	calculate(200,10);
	System.out.println("Program Ends.....");
}


}
