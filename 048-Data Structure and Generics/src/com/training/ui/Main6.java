package com.training.ui;

import com.training.ds.CircleStack;
import com.training.ds.IntegerStack;
import com.training.model.Circle;

public class Main6 {
public static void main(String[] args) {


	CircleStack stack1 = new CircleStack(10);
Circle c1 = new Circle(10);
Circle c2 = new Circle(20);
Circle c3 = new Circle(30);
Circle c4 = new Circle(50);
Circle c5 = new Circle(70);
	stack1.push(c1);
	stack1.push(c2);
	stack1.push(c3);
	stack1.push(c4);
	stack1.push(c5);
	
	System.out.println(stack1);

	Circle r = stack1.pop();
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
