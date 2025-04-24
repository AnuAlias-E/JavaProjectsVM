package com.training.ui;
//NullPointerException
public class Main04 {


	public static void main(String[] args) {
		System.out.println("Program Begins.....");
		String str=null;
		try {
		int x=str.length();
		System.out.println(x);
		}catch (NullPointerException e) {
		System.out.println(e);
		}
		System.out.println("Program End....");
	}


}
