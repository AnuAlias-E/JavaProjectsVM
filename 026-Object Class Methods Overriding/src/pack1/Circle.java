package pack1;

import java.util.Objects;

public class Circle {
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return 2.14 * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "\narea=" + getArea() + "]";
	}

	public boolean equals(Object o) {
		Circle other = (Circle) o;
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Circle))
			return false;
		if (this.radius == other.radius)
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		int result = this.radius * 50;
		return result;
	}
}
