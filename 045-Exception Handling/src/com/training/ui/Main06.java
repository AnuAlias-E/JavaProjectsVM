package com.training.ui;

public class Main06 {


	public static void main(String[] args) {
		System.out.println("Program Begins.....");
		try {
		System.out.println(100/3);
		int []arr= {1,2,3,4,5};
		System.out.println(arr[4]);
		System.out.println(Integer.parseInt("12fgf"));
		String str=null;
		System.out.println(str.length());
		}	
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		catch (Throwable e) {
			System.out.println("Some Error Occured: "+e);
			System.out.println("Continuing.....");
		}
		finally {
			System.out.println("Good Bye");
		}
		System.out.println("Program End....");
	}




}
