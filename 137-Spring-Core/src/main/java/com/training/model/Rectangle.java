package com.training.model;

public class Rectangle implements Shape {
	int height, width;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void setSize(int size) {
		this.setHeight(size * 2);
		this.setWidth(size);

	}

	@Override
	public double getArea() {

		return this.height * this.width;
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}

}
