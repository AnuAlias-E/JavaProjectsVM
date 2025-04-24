package com.training.ui;

import com.training.model.A;

public class Main01 {
	public static void main(String[] args) {
		A obj1 = new A();
		obj1.setX(10);
		// obj1.printX();
		System.out.println("B " + obj1.getObj().toString());
		System.out.println("A " + obj1.toString());
		// obj1.getObj().printY();
	}
}
