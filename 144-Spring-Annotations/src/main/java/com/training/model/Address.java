package com.training.model;

public class Address {
	String doorNumber;
	String cityName;
	String pinCode;

	public Address(String doorNumber, String cityName, String pinCode) {
		super();
		this.doorNumber = doorNumber;
		this.cityName = cityName;
		this.pinCode = pinCode;
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "\nAddress [doorNumber=" + doorNumber + ", cityName=" + cityName + ", pinCode=" + pinCode + "]";
	}

}
