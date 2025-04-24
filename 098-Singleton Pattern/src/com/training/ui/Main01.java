package com.training.ui;

import com.training.model.IDGenerator;

public class Main01 {
	public static void main(String[] args) {
		IDGenerator generator = IDGenerator.getInstance();
		System.out.println(generator.getNextId());
		System.out.println(generator.getNextId());
		System.out.println(generator.getNextId());
		System.out.println(generator.getNextId());

		IDGenerator generator2 = IDGenerator.getInstance();
		;
		System.out.println(generator2.getNextId());
		System.out.println(generator2.getNextId());
		System.out.println(generator2.getNextId());
		System.out.println(generator2.getNextId());

		IDGenerator generator3 = IDGenerator.getInstance();
		;
		System.out.println(generator3.getNextId());
		System.out.println(generator3.getNextId());
		System.out.println(generator3.getNextId());
		System.out.println(generator3.getNextId());

		System.out.println(generator);
		System.out.println(generator2);
		System.out.println(generator3);
	}
}
