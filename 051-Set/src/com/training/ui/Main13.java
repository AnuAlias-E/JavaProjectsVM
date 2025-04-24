package com.training.ui;

import java.util.Set;
import java.util.TreeSet;

import com.training.model.Square;
import com.training.model.comparators.SquareComparator;

public class Main13 {
public static void main(String[] args) {
	SquareComparator squareComparator = new SquareComparator();
	Set<Square> squares= new TreeSet<>(squareComparator);
	squares.add(new Square(10));
	squares.add(new Square(5));
	squares.add(new Square(7));
	
	System.out.println(squares);
	System.out.println(squares.contains(new Square(10)));
}
}
