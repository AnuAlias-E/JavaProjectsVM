
public class Manager extends Employee {
	private int employeeCount;

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	double computeAllowance() {
		return bascicSalary * 0.40;
	}
}
