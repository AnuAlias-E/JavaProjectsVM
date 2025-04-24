package com.training.model;

public class Car {
	String model;
	int doors;
	String color;
	Engine engine;
	Wheel wheels;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel getWheels() {
		return wheels;
	}

	public void setWheels(Wheel wheels) {
		this.wheels = wheels;
	}

	@Override
	public String toString() {
		return "\nCar [model=" + model + ", doors=" + doors + ", color=" + color + ", engine=" + engine + ", wheels="
				+ wheels + "]";
	}

}
