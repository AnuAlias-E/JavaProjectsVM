package com.training.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

	@Column
	String doorNo;
	@Column
	String areaName;
	@Column
	String city;
	@Column
	String pincode;

	public Address() {
		super();
	}

	public Address(String doorNo, String areaName, String city, String pincode) {
		super();
		this.doorNo = doorNo;
		this.areaName = areaName;
		this.city = city;
		this.pincode = pincode;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "\nAddress [doorNo=" + doorNo + ", areaName=" + areaName + ", city=" + city + ", pincode=" + pincode
				+ "]";
	}

}
