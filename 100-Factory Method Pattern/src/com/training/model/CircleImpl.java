package com.training.model;

class CircleImpl implements Shape {
	private int radius;

	public CircleImpl(int radius) {
		super();
		this.radius = radius;
	}

	public CircleImpl() {
		super();
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void setSize(int size) {
		this.setRadius(size);

	}

	@Override
	public double getArea() {
		return 3.14 * this.radius * this.radius;
	}

}
