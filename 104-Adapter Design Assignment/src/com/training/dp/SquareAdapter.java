package com.training.dp;

public class SquareAdapter implements Shape {
	Square square;

	public SquareAdapter(Square square) {
		super();
		this.square = square;
	}

	@Override
	public void setSize(double size) {
		square.setSize(size);

	}

	@Override
	public double getArea() {

		return square.computeArea();
	}

}
