package com.training.model;

public class Square implements Comparable<Square> {
	private int size;

	public Square(int size) {
		super();
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + size;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Square))
			return false;
		Square other = (Square) obj;
		if (size != other.size)
			return false;
		return true;
	}

	public int getArea() {
		return this.size * this.size;
	}

	@Override
	public String toString() {
		return "\nSquare [Size=" + getSize() + ", Area=" + getArea() + "]";
	}


	@Override
	public int compareTo(Square o) {
		//return this.size-o.size;
				return Integer.compare(this.size, o.size);

//				if (this.size < o.size)
//					return -1;
//				if (this.size > o.size)
//					return 1;
//				return 0;
			}
	}

