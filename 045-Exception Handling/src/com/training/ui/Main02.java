package com.training.ui;
//ArraysIndexOutOfBoundsException
public class Main02 {

	public static void main(String[] args) {
		System.out.println("Program Begins.....");
		
		int[]arr= {1,2,3,4,5};
		try {
		System.out.println(arr[90]);
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("Program End....");
	}

}
