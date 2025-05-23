package pack1;

public class Employee {
	private int id;
	String name;
	double basic;
	char grade;

	public Employee(int id, String name, double basic, char grade) {
		super();
		this.id = id;
		this.name = name;
		this.basic = basic;
		this.grade = grade;
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

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public double getAllowance() {
		return basic * 0.35;
	}

	public double getTax() {
		return basic * 0.10;
	}

	public double getNetSalary() {
		return basic + getAllowance() - getTax();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basic=" + basic + ", grade=" + grade + ", Allowance="
				+ getAllowance() + ", Tax=" + getTax() + ", NetSalary=" + getNetSalary() + "]";
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
