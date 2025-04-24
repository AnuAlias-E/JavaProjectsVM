package com.training.model;

public class Address {
private int houseNo;
private String streetName;
private String city;
private String zipcode;


public Address() {
	super();
}


public Address(int houseNo, String streetName, String city, String zipcode) {
	super();
	this.houseNo = houseNo;
	this.streetName = streetName;
	this.city = city;
	this.zipcode = zipcode;
}


public int getHouseNo() {
	return houseNo;
}


public void setHouseNo(int houseNo) {
	this.houseNo = houseNo;
}


public String getStreetName() {
	return streetName;
}


public void setStreetName(String streetName) {
	this.streetName = streetName;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getZipcode() {
	return zipcode;
}


public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}


@Override
public String toString() {
	return "\nAddress [houseNo=" + houseNo + ", streetName=" + streetName + ", city=" + city + ", zipcode=" + zipcode
			+ "]";
}


}
