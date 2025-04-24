package com.training.ui;

import com.training.ds.StackImpl;
import com.training.model.Circle;
import com.training.model.Square;

public class Main9 {
	public static void main(String[] args) {
		try {
			StackImpl<Circle> stack1 = new StackImpl<>(4);
			stack1.push(new Circle(10));
			stack1.push(new Circle(20));
			stack1.push(new Circle(30));
			stack1.push(new Circle(40));

			Circle r = stack1.pop();
			stack1.pop();
			stack1.pop();
			stack1.pop();
			stack1.pop();
			System.out.println(stack1);
			System.out.println("Removed Object :" + r);

			System.out.println(r.getRadius() + " " + r.getArea());

			StackImpl<Square> stack2 = new StackImpl<>(20);
			stack2.push(new Square(10));
			stack2.push(new Square(20));
			stack2.push(new Square(30));
			stack2.push(new Square(40));
			stack2.push(new Square(50));

			Square r1 = stack2.pop();
			System.out.println(stack2);
			System.out.println("Removed Object :" + r1);

			System.out.println(r1.getSize() + " " + r1.getArea());

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
