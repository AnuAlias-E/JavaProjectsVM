package com.training.model;

public class IDGenerator {

	private int number;

	// Step1
	private IDGenerator() {

	}

	// Step2
	private static IDGenerator instance = null;

	// Step3
	public static IDGenerator getInstance() {
		if (instance == null) {
			instance = new IDGenerator();

		}
		return instance;
	}

	public int getNextId() {
		return ++number;
	}

}
