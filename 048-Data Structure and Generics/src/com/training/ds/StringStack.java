package com.training.ds;

public class StringStack {


	String[] arr;
	int index = 0;

	public StringStack(int size) {
		this.arr = new String[size];
	}

	public void push(String data) {
		this.arr[index] = data;
		index++;
	}

	public String pop() {
		index--;
		String r = this.arr[index];
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
