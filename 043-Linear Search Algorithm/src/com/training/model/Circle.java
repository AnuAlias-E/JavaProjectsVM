package com.training.model;

public class Circle implements Comparable {
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

	@Override
	public String toString() {
		return "\nCircle [Radius=" + getRadius()+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + radius;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Circle))
			return false;
		Circle other = (Circle) obj;
		if (radius != other.radius)
			return false;
		return true;
	}

	public double getArea() {
		return 3.14 * this.radius * this.radius;
	}

	@Override
	public int compareTo(Object o) {
		Circle other = (Circle)o;
		return this.radius-other.radius;
	}
}
