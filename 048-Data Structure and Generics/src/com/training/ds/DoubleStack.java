package com.training.ds;

public class DoubleStack {

	double[] arr;
	int index = 0;

	public DoubleStack(int size) {
		this.arr = new double[size];
	}

	public void push(double data) {
		this.arr[index] = data;
		index++;
	}

	public double pop() {
		index--;
		double r = this.arr[index];
		return r;

	}

	public String toString() {
		String str ="[";
		for(int i=0;i<index;i++)
			if(i==index-1)
				str= str+this.arr[i];
			else {
				str= str+this.arr[i]+",";
			}
		str =str + "]";
		return str;
	}



}
