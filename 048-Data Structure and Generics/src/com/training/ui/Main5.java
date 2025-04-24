package com.training.ui;

import com.training.ds.IntegerStack;

public class Main5 {
	public static void main(String[] args) {

		IntegerStack stack1 = new IntegerStack(10);

		stack1.push(Integer.valueOf(100));
		stack1.push(Integer.valueOf(200));
		stack1.push(Integer.valueOf(300));
		stack1.push(Integer.valueOf(400));
		stack1.push(Integer.valueOf(500));
		stack1.push(Integer.valueOf(600));
		
		System.out.println(stack1);

		Integer r = stack1.pop();
		System.out.println("Removed element: " + r);
		System.out.println(stack1);

		r = stack1.pop();
		System.out.println("Removed element : " + r);
		System.out.println(stack1);

		r = stack1.pop();
		System.out.println("Removed element : " + r);
		System.out.println(stack1);

	}
}
