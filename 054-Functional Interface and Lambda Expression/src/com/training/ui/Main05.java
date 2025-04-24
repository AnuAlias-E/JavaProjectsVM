package com.training.ui;

import com.training.model.Acceptor;

public class Main05 {
	public static void main(String[] args) {
		Acceptor<String> acceptor;
		// Lambda Expression
		acceptor = (String s) -> {
			System.out.println(s.length());
			System.out.println(s.toUpperCase());
		};
		acceptor.accept("Anu Alias");
		// Lambda Expression
		Acceptor<Integer> acceptor2;
		acceptor2 = num -> System.out.println(num.intValue() + "," + num.doubleValue());
		acceptor2.accept(400);
		// Lambda Expression
		Acceptor<Double> acceptor3;
		acceptor3 = obj -> System.out.println(obj.intValue());
		acceptor3.accept(400.00);

		Acceptor<StringBuffer> acceptor4;
		acceptor4 = str -> {
			System.out.println("The original String is: " + str);
			System.out.println("Reversed String is: " + str.reverse());
		};
		acceptor4.accept(new StringBuffer("Anu Alias"));
	}
}
