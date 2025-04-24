package com.training.model;

public class Engine {
	String engineType;
	int capacity;
	String fuelType;

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "\nEngine [engineType=" + engineType + ", capacity=" + capacity + ", fuelType=" + fuelType + "]";
	}

}
