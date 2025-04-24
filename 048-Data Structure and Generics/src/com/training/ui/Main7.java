package com.training.ui;

import com.training.ds.CircleStack;
import com.training.ds.SquareStack;
import com.training.model.Circle;
import com.training.model.Square;

public class Main7 {
	public static void main(String[] args) {

		SquareStack stack1 = new SquareStack(10);
		Square s1 = new Square(10);
		Square s2 = new Square(20);
		Square s3 = new Square(30);
		Square s4 = new Square(50);
		Square s5 = new Square(70);
		stack1.push(s1);
		stack1.push(s2);
		stack1.push(s3);
		stack1.push(s4);
		stack1.push(s5);

		System.out.println(stack1);

		Square r = stack1.pop();
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
