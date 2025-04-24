
public class Circle {
	private int radius;

	Circle() {// Circle Method
		System.out.println("Circle Object is created");
	}

	Circle(int radius) {
		setRadius(radius);
		System.out.println("Circle object is created with radius " + radius);
	}

	double getArea() {
		return 3.14 * radius * radius;
	}

	void setRadius(int rad) {
		if (rad < 0) {
			System.out.println("Invalid Radius");
			return;
		}
		radius = rad;
	}

	int getRadius() {
		return radius;
	}

}
