package com.training.model;

public class Manager extends Employee{
private int employeeCount;

public Manager() {
	super();
}

public Manager(int id, String name, String gender, String cityName, double basic, int employeeCount) {
	super(id, name, gender, cityName, basic);
	this.employeeCount = employeeCount;
}

public int getEmployeeCount() {
	return employeeCount;
}

public void setEmployeeCount(int employeeCount) {
	this.employeeCount = employeeCount;
}

@Override
	public double getNetSalary() {
		double net= super.getNetSalary()+(employeeCount*1000);
		return net;
	}

@Override
public String toString() {
	return "\nManager [employeeCount=" + employeeCount + ", getNetSalary()=" + getNetSalary() + ", getId()=" + getId()
			+ ", getName()=" + getName() + ", getGender()=" + getGender() + ", getCityName()=" + getCityName()
			+ ", getBasic()=" + getBasic() + "]";
}

}
