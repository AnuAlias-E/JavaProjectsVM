package com.training.model;

public class Switch {
	Switchable switchable;

	public Switch(Switchable switchable) {
		this.switchable = switchable;
	}

	public void turnOn() {
		switchable.turnOn();
	}

	public void turnOff() {
		switchable.turnOff();

	}

}
