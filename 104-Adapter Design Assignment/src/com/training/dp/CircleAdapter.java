package com.training.dp;

public class CircleAdapter implements Shape {
	Circle circle;

	public CircleAdapter(Circle circle) {
		super();
		this.circle = circle;
	}

	@Override
	public void setSize(double size) {
		circle.setRadius(size);

	}

	@Override
	public double getArea() {

		return circle.computeArea();
	}

}
