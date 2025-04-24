package com.training.ds;

import com.training.model.Circle;

public class CircleStack {
	Circle[] circles;
	
	int index = 0;


	public CircleStack(int size) {
		this.circles = new Circle[size];
	}

	public void push(Circle data) {
		this.circles[index] = data;
		index++;
	}

	public Circle pop() {
		index--;
		Circle r = this.circles[index];
		return r;

	}

	public String toString() {
		String str ="[";
		for(int i=0;i<index;i++)
			if(i==index-1)
				str= str+this.circles[i];
			else {
				str= str+this.circles[i]+",";
			}
		str =str + "]";
		return str;
	}


	}