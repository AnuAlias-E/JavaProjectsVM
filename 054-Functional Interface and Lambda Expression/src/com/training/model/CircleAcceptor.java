package com.training.model;

public class CircleAcceptor implements Acceptor<Circle>{

	@Override
	public void accept(Circle obj) {
		System.out.println(obj.getRadius()+","+obj.getArea());
	}

}
