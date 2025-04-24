package com.training.ui;

import java.util.Arrays;

public class Main4 {
	static void createArray(int size) {
		System.out.println("createArray() method Begins.....");
		try {
		double [] arr = new double[size];
		System.out.println(Arrays.toString(arr));
		}catch (NegativeArraySizeException e) {
			e.printStackTrace();
			System.out.println("Continuing....");
		}finally {
			System.out.println("Thank you ");
		}
		System.out.println("createArray() method ends.....");

	}
public static void main(String[] args) {
	System.out.println("Program Begins.....");
	
	
	createArray(10);
	createArray(5);
	createArray(0);
	createArray(-40);
	createArray(25);
	System.out.println("Program Ends.....");
}




}
