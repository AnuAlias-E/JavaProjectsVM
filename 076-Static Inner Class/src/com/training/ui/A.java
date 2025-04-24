package com.training.ui;

public class A {
		private int x;
		

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
			return "A [x=" + x + "]";
		}

		public static class B {// -static Inner Class
			private int y;

			public int getY() {
				return y;
			}

			public void setY(int y) {
				this.y = y;
			}

			@Override
			public String toString() {
				return "B [y=" + y + "]";
			}

			public void printY() {
				System.out.println(" y=" + y);
			}
		}
	}