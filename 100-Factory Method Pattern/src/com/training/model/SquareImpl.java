package com.training.model;

class SquareImpl implements Shape {
	private int size;

	public SquareImpl() {
		super();
	}

	public SquareImpl(int size) {
		super();
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	@Override
	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public double getArea() {

		return this.size * this.size;
	}

}
