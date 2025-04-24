package com.training.model;

public class A {
	//Anonymous Inner Classes
		private int x;
		private B obj;

		public A() {
			obj = new B() {//Anonymous Inner class NameLess class
				
				@Override
				public void test() {
					System.out.println("test implementation");
					
				}
			};
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
			return "A [x=" + x +  "]";
		}

		public abstract class B {
			
			public abstract void test();
		}
}


