package com.training.model;

public class SalesEmployee {
int id;
String name;
double basicSalary;
Address address;
public SalesEmployee(int id, String name, double basicSalary,Address address) {
	super();
	this.id = id;
	this.name = name;
	this.basicSalary = basicSalary;
	this.address=address;
}
@Override
public String toString() {
	return "SalesEmployee [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary +", address=" + address+ "]";
}


}
