package com.training.model;

public class Wheel {
	int size;
	String brand;
	String material;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "\nWheel [size=" + size + ", brand=" + brand + ", material=" + material + "]";
	}

}
