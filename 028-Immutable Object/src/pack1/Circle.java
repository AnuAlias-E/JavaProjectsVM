package pack1;

public class Circle {
	final private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}

	public Circle enLarge(int byRadius) {

		Circle temp = new Circle(this.radius + byRadius);
		return temp;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", Radius=" + getRadius() + ", Area=" + getArea() + "]";
	}

	
}
