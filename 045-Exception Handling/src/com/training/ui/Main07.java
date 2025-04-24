package com.training.ui;

public class Main07 {
	public static void main(String[] args) {
		try {
			System.out.println(100/3);
			int []arr= {1,2,3,4,5};
			System.out.println(arr[4]);
			System.out.println(Integer.parseInt("12"));
			String str="sdfg3rwe";
			System.out.println(str.length());
			}	catch(Throwable e) {
				e.printStackTrace();
			}
		finally {
			System.out.println("Thank you");
		}
	}

}
