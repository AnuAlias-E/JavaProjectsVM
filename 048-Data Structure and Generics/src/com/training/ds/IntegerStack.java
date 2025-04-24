package com.training.ds;

public class IntegerStack {

	Integer[] arr;
	int index = 0;

	public IntegerStack(int size) {
		this.arr = new Integer[size];
	}

	public void push(Integer data) {
		this.arr[index] = data;
		index++;
	}

	public Integer pop() {
		index--;
		Integer r = this.arr[index];
		return r;

	}

	public String toString() {
		String str = "[";
		for (int i = 0; i < index; i++)
			if (i == index - 1)
				str = str + this.arr[i];
			else {
				str = str + this.arr[i] + ",";
			}
		str = str + "]";
		return str;
	}

}
