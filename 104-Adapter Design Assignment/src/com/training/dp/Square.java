package com.training.dp;

public class Square {
	double size;

	public Square(double size) {
		super();
		this.size = size;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double computeArea() {
		return this.size * this.size;
	}

}
