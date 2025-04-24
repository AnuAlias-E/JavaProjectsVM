package com.training.ui;

import com.training.model.Acceptor;
import com.training.model.DoubleAcceptor;
import com.training.model.IntegerAcceptor;
import com.training.model.StringAcceptor;

public class Main01 {
	public static void main(String[] args) {
		Acceptor<String> acceptor = new StringAcceptor();
		acceptor.accept("Welcome");

		Acceptor<Integer> acceptor1 = new IntegerAcceptor();
		acceptor1.accept(10);

		Acceptor<Double> acceptor2 = new DoubleAcceptor();
		acceptor2.accept(Double.valueOf(10));
	}
}
