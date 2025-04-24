package com.training.model;

public class Switch {
	LightBulb lightBulb;
	Radio radio;

	public Switch(LightBulb lightBulb, Radio radio) {
		this.lightBulb = lightBulb;
		this.radio = radio;
	}

	public void turnOn() {
		lightBulb.turnOn();
		radio.turnOn();
	}

	public void turnOff() {
		lightBulb.turnOff();
		radio.turnOff();

	}

}
