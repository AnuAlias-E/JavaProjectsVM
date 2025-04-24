package com.training.model;

public class IntegerAcceptor implements Acceptor<Integer>{

	@Override
	public void accept(Integer obj) {
		System.out.println(obj.intValue()*obj.intValue());
		
	}

}
