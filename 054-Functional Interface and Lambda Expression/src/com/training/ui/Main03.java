package com.training.ui;

import com.training.model.Acceptor;

public class Main03 {
	public static void main(String[] args) {

		Acceptor<String> acceptor1;
//Anonymous Inner Class
		acceptor1 = new Acceptor<String>() {
			@Override
			public void accept(String obj) {
				System.out.println(obj.toUpperCase());

			}

		};

		acceptor1.accept("ust global");

		Acceptor<Integer> acceptor2;

		acceptor2 = new Acceptor<Integer>() {
			@Override
			public void accept(Integer obj) {
				System.out.println(obj.intValue() * obj.intValue());

			}

		};

		acceptor2.accept(400);

		Acceptor<Double> acceptor3;

		acceptor3 = new Acceptor<Double>() {
			@Override
			public void accept(Double obj) {
				System.out.println(obj.intValue() * obj.intValue() * obj.intValue());

			}

		};

		acceptor3.accept(Double.valueOf(30.0));
	}
}