package com.training.model;





import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public class Employee {
	
	@Min(value=1, message="Id should be equal to or above 1")
	int id;
	@NotBlank(message ="Name is mandatory ... Cannot  be left blank")
	String name;
	String gender;
	@Size(min=4, max=20,message="Length of City should be between 4 to 20" )
	String city;
	@Min(value=1000, message="Basic Salary should be at least 1000")
	double basic;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String gender, String city, double basic) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.city = city;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", gender=" + gender + ", city=" + city + ", basic=" + basic
				+ "]";
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

	public double getAllowance() {
		return this.basic * 0.35;
	}

	public double getTax() {
		return this.basic * 0.10;
	}

	public double getNetSalary() {
		return this.basic + this.getAllowance() - this.getTax();
	}
}
