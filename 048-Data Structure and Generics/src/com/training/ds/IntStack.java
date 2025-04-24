package com.training.ds;

public class IntStack {
	int[] arr;
	int index = 0;

	public IntStack(int size) {
		this.arr = new int[size];
	}

	public void push(int data) {
		this.arr[index] = data;
		index++;
	}

	public int pop() {
		index--;
		int r = this.arr[index];
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
