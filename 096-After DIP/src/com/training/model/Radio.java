package com.training.model;

public class Radio implements Switchable{
	@Override
	public void turnOn() {
		System.out.println("Radio is ON");
	}
	@Override
	public void turnOff() {
		System.out.println("Radio is OFF");

	}
}
