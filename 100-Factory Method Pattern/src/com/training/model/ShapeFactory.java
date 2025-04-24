package com.training.model;

public class ShapeFactory {

	public static Shape createShape(int type) {
		Shape shape = null;

		if (type == 1)
			shape = new CircleImpl();
		if (type == 2)
			shape = new SquareImpl();
		if (type == 3)
			shape = new RectangleImpl();

		return shape;
	}

//	int type;
//	int size;
//
//	public ShapeFactory() {
//		super();
//	}
//
//	public ShapeFactory(int type, int size) {
//		super();
//		this.type = type;
//		this.size = size;
//	}
//
//	public Shape createShape() {
//		Shape shape = null;
//
//		if (this.type == 1)
//			shape = new CircleImpl();
//		if (type == 2)
//			shape = new SquareImpl();
//		if (type == 3)
//			shape = new RectangleImpl();
//
//		return shape;
//	}

}
