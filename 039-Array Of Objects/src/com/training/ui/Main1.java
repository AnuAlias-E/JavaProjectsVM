package com.training.ui;

import com.training.model.Circle;

public class Main1 {
	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		int c = 300;

		int[] arr = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		Circle [] circles=new Circle[4];
		
		Circle c1 = new Circle(10);		
		Circle c2 = new Circle(5);		
		Circle c3 = new Circle(15);
		Circle c4= new Circle(30);
		
		circles[0]=c1;
		circles[1]=c2;
		circles[2]=c3;
		circles[3]=c4;
		
		for(Circle circle :circles) {
			//System.out.println(circle.getRadius()+","+circle.getArea());
			System.out.println(circle);
		}
		
		circles=null;
		c1=null;
		c2=null;
		c3=null;
		c4=null;
		
	}
}
