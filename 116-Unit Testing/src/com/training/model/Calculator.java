package com.training.model;

public class Calculator {
		int num1;
		int num2;
		
		public Calculator(int num1, int num2) {
			super();
			this.num1 = num1;
			this.num2 = num2;
		}

		public Calculator() {
			super();
		}
		
		public int add() {
			return this.num1+this.num2;
		}
		
		public int subtract() {
			return this.num1-this.num2;
		}
		
		public int multiply() {
			return this.num1*this.num2;
		}
		
		public int divide() {
			return this.num1/this.num2;
		}
}
