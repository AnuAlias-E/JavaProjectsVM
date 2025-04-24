package com.training.model;

public class Employee {
	int id;
	String name;
	double basic;
	String gender;

	public Employee() {
		super();
	}

	public Employee(int id, String name, double basic, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.basic = basic;
		this.gender = gender;
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

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basic=" + basic + ", gender=" + gender + "]";
	}

	public double getAllowance() {
		return Math.round(this.basic * 0.35);
	}

	public double getTax() {
		return Math.round(this.basic * 0.10);
	}

	public double getNetSalary() {
		return Math.round(this.basic + this.getAllowance() - this.getTax());
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

}
