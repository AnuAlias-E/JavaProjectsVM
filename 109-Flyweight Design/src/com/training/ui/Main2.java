package com.training.ui;

import com.training.dp.Circle;
import com.training.dp.ShapeFactory;

public class Main2 {
	private static final String colors[] = { "Red", "Green", "Blue", "Black" };

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			Circle circle = ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandonX());
			circle.setY(getRandonY());
			circle.setRadius(100);
			circle.draw();
		}
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandonY() {
		return (int) (Math.random() * 100);
	}

	private static int getRandonX() {
		return (int) (Math.random() * 100);
	}
}
