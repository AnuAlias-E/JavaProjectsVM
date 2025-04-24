package com.training.model;

public class StringAcceptor implements Acceptor<String> {

	@Override
	public void accept(String obj) {
		System.out.println(obj.toUpperCase());

	}

}
