package com.training.ui;

import com.training.model.Square;

public class Main2 {
	public static void main(String[] args) {
		Square[] squares = new Square[4];

		Square s1 = new Square(10);
		Square s2 = new Square(5);
		Square s3 = new Square(20);
		Square s4 = new Square(30);
		squares[0] = s1;
		squares[1] = s2;
		squares[2] = s3;
		squares[3] = s4;
		
		for(Square square :squares) {
			System.out.println(square);
		}
		squares=null;
		s1=null;
		s2=null;
		s3=null;
		s4=null;
		
		
	}
}
