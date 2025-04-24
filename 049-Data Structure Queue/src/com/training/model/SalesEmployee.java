package com.training.model;

public class SalesEmployee extends Employee {
	private double salesAmount;

	public SalesEmployee() {
		super();
	}

	public SalesEmployee(int id, String name, String gender, String cityName, double basic, double salesAmount) {
		super(id, name, gender, cityName, basic);
		this.salesAmount = salesAmount;
	}

	public double getSalesAmount() {
		return salesAmount;
	}

	public void setSalesAmount(double salesAmount) {
		this.salesAmount = salesAmount;
	}

	@Override
	public double getNetSalary() {
		double net = super.getNetSalary() + (salesAmount * 0.25);
		return net;
	}

	@Override
	public String toString() {
		return "\nSalesEmployee [getSalesAmount()=" + getSalesAmount() + ", getNetSalary()=" + getNetSalary()
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getGender()=" + getGender()
				+ ", getCityName()=" + getCityName() + ", getBasic()=" + getBasic() + "]";
	}
	
	

}
