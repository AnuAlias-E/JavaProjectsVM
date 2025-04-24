package com.training.ui;

import com.training.model.LightBulb;
import com.training.model.Radio;
import com.training.model.Switch;

public class Main01 {
	public static void main(String[] args) {
		LightBulb bulb = new LightBulb();
		Radio radio = new Radio();
		Switch switch1 = new Switch(bulb, radio);
		switch1.turnOn();
		switch1.turnOff();
	}
}
