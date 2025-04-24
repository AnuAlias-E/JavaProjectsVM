package com.training.ds;

public class LongStack {

	long[] arr;
	int index = 0;

	public LongStack(int size) {
		this.arr = new long[size];
	}

	public void push(long data) {
		this.arr[index] = data;
		index++;
	}

	public long pop() {
		index--;
		long r = this.arr[index];
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
