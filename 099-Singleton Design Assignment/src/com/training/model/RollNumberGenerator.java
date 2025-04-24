package com.training.model;

public class RollNumberGenerator {
	private int num = 1000;

	public int getNextRollNumber() {
		return ++num;
	}

	private RollNumberGenerator() {

	}

	private static RollNumberGenerator instance = null;

	public static RollNumberGenerator getinstance() {
		if (instance == null)
			instance = new RollNumberGenerator();

		return instance;
	}
}
