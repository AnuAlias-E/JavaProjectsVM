package com.training.ds;

import com.training.model.Square;

public class SquareStack {
	

	Square[] squares;
	
	int index = 0;


	public SquareStack(int size) {
		this.squares = new Square[size];
	}

	public void push(Square data) {
		this.squares[index] = data;
		index++;
	}

	public Square pop() {
		index--;
		Square r = this.squares[index];
		return r;

	}

	public String toString() {
		String str ="[";
		for(int i=0;i<index;i++)
			if(i==index-1)
				str= str+this.squares[i];
			else {
				str= str+this.squares[i]+",";
			}
		str =str + "]";
		return str;
	}


	

}
