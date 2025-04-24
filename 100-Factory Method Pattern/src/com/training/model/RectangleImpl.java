package com.training.model;

class RectangleImpl implements Shape {
	private int width;
	private int height;

	public RectangleImpl() {
		super();
	}

	public RectangleImpl(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void setSize(int size) {
		this.setWidth(size);
		this.setHeight(size * 2);
	}

	@Override
	public double getArea() {
		return this.height * this.width;
	}

}
