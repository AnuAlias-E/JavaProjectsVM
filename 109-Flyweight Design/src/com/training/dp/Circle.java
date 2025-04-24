package com.training.dp;

public class Circle implements Shape {
	private String color;
	private int radius;
	private int x;
	private int y;

	public Circle() {
		super();
	}

	public Circle(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void draw() {
		System.out.println("Circle Draw():Color :" + color + ",x : " + x + ", y: " + y + ", radius : " + radius + "]");

	}

	@Override
	public String toString() {
		return "Circle [color=" + color + ", radius=" + radius + ", x=" + x + ", y=" + y + "]";
	}

}
