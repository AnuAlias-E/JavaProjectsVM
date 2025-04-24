package com.training.model;

public class Square implements Shape {
	int side;

	public Square(int size) {
		super();
		this.side = size;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int size) {
		this.side = size;
	}

	@Override
	public int getArea() {
		return side * side;
	}

}
