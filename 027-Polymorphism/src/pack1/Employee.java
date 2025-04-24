package pack1;

public class Employee {
	private double basicSalary;

	public Employee(double basicSalary) {
		super();
		this.basicSalary = basicSalary;
	}

	public double doublecalculateNetSalary() {
		double allowance = this.basicSalary * 0.40;
		double net = this.basicSalary + allowance;
		return net;
	}

	public double doublecalculateNetSalary(int extraHours) {
		double allowance = this.basicSalary * 0.40;
		double net = this.basicSalary + allowance + (extraHours * 1000);
		return net;
	}

	public double doublecalculateNetSalary(int extraHours, double perHourPayment) {
		double allowance = this.basicSalary * 0.40;
		double net = this.basicSalary + allowance + (extraHours * perHourPayment);
		return net;
	}

	@Override
	public String toString() {
		return "Employee [basicSalary=" + basicSalary + ", NetSalary=" + doublecalculateNetSalary()
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(basicSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (Double.doubleToLongBits(basicSalary) != Double.doubleToLongBits(other.basicSalary))
			return false;
		return true;
	}
	
}
