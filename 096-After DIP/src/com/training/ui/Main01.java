package com.training.ui;

import com.training.model.LightBulb;
import com.training.model.Radio;
import com.training.model.Switch;
import com.training.model.Switchable;
import com.training.model.TV;

public class Main01 {
	public static void main(String[] args) {
		Switchable switchable = new LightBulb();
		Switch lightSwitch = new Switch(switchable);
		lightSwitch.turnOn();
		lightSwitch.turnOff();

		switchable = new Radio();
		Switch radioSwicth = new Switch(switchable);
		radioSwicth.turnOn();
		radioSwicth.turnOff();

		switchable = new TV();
		Switch tvSwicth = new Switch(switchable);
		tvSwicth.turnOn();
		tvSwicth.turnOff();

	}
}
