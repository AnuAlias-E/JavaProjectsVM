package com.training.model;

public class DoubleAcceptor implements Acceptor<Double> {

	@Override
	public void accept(Double obj) {
		System.out.println(obj.intValue()*obj.intValue()*obj.intValue());
		
	}

}
