package com.training.model;

//Association-Composition
public class A {// Inner Classes
	private int x;
	private B obj;

	public A() {
		obj = new B();
	}

	public B getObj() {
		return obj;
	}

	public void setObj(B obj) {
		this.obj = obj;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void printX() {
		System.out.println("x= in A class " + x);
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", obj=" + obj + "]";
	}

	public class B {// -Regular Inner Class
		private int y;

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public void printY() {
			System.out.println("x= " + x + " B object=" + obj + " y=" + y);
		}

		@Override
		public String toString() {
			return "B [y=" + y + "]";
		}

	}
}
