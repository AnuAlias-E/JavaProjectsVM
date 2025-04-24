package com.training.ui;

import com.training.model.RollNumberGenerator;

public class Main01 {
	public static void main(String[] args) {
		RollNumberGenerator rollNoGenerator = RollNumberGenerator.getinstance();
		System.out.println(rollNoGenerator.getNextRollNumber());
		System.out.println(rollNoGenerator.getNextRollNumber());
		System.out.println(rollNoGenerator.getNextRollNumber());
		System.out.println(rollNoGenerator.getNextRollNumber());
		System.out.println(rollNoGenerator.getNextRollNumber());
		RollNumberGenerator rollNoGenerator1 = RollNumberGenerator.getinstance();
		System.out.println(rollNoGenerator1.getNextRollNumber());
		System.out.println(rollNoGenerator1.getNextRollNumber());
		System.out.println(rollNoGenerator1.getNextRollNumber());
		System.out.println(rollNoGenerator1.getNextRollNumber());
		System.out.println(rollNoGenerator1.getNextRollNumber());
		RollNumberGenerator rollNoGenerator2 = RollNumberGenerator.getinstance();
		System.out.println(rollNoGenerator2.getNextRollNumber());
		System.out.println(rollNoGenerator2.getNextRollNumber());
		System.out.println(rollNoGenerator2.getNextRollNumber());
		System.out.println(rollNoGenerator2.getNextRollNumber());
		System.out.println(rollNoGenerator2.getNextRollNumber());
		System.out.println(rollNoGenerator);
		System.out.println(rollNoGenerator1);
		System.out.println(rollNoGenerator2);

	}
}
