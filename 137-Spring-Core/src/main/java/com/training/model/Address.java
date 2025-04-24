package com.training.model;

public class Address {
	String doorNo;
String city;
String pinCode;
public String getDoorNo() {
	return doorNo;
}
public void setDoorNo(String doorNo) {
	this.doorNo = doorNo;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPinCode() {
	return pinCode;
}
public void setPinCode(String pinCode) {
	this.pinCode = pinCode;
}
@Override
public String toString() {
	return "\nAddress [doorNo=" + doorNo + ", city=" + city + ", pinCode=" + pinCode + "]";
}


}
