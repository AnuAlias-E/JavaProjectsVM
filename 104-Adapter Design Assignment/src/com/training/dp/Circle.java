package com.training.dp;

public class Circle {
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double computeArea() {

		return 3.14 * radius * radius;
	}

}
