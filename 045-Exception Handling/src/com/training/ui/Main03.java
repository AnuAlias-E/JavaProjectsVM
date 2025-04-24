package com.training.ui;
//NumberFormatException
public class Main03 {

	public static void main(String[] args) {
		System.out.println("Program Begins.....");
		String str="123abcd";
		try {
		int x=Integer.parseInt(str);
		System.out.println(x);
		}catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program End....");
	}

}
