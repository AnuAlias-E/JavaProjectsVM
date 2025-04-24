package com.training.model;

public class Employee implements Comparable {
private int id;
private String name;
private String gender;
private String cityName;
private double basic;


public Employee() {
	super();
}
public Employee(int id, String name, String gender, String cityName, double basic) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.cityName = cityName;
	this.basic = basic;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCityName() {
	return cityName;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}
public double getBasic() {
	return basic;
}
public void setBasic(double basic) {
	this.basic = basic;
}

public double getNetSalary() {
	return basic+(basic*0.40)-(basic*0.10);
}
@Override
public String toString() {
	return "\nEmployee [id=" + id + ", name=" + name + ", gender=" + gender + ", cityName=" + cityName + ", basic="
			+ basic + ", NetSalary=" + getNetSalary() + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!(obj instanceof Employee))
		return false;
	Employee other = (Employee) obj;
	if (id != other.id)
		return false;
	return true;
}
@Override
public int compareTo(Object o) {
	Employee other =(Employee)o;
	if (this.id < other.id)
		return -1;
	if (this.id > other.id)
		return 1;
	return 0;
}


}
