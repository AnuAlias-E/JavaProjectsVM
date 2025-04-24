package com.training.ds;

import com.training.model.Circle;

public class CricleQueueImpl implements Queue<Circle>{

	Circle[] circles;

	int index = 0;

	
	public CricleQueueImpl(int size) {
		this.circles = new Circle[size];
	}

	@Override
	public void enQueue(Circle object) throws Throwable {
		
	}

	@Override
	public Circle deQueue() throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

}
