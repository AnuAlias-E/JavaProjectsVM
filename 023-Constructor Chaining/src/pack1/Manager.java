package pack1;

public class Manager extends Employee {
	private int employeeCount;

	public Manager(int id, String name, double basic, String gender, int employeeCount) {
		super(id, name, basic, gender);
		this.employeeCount = employeeCount;
	}

	public Manager(int id, String name, double basic, String gender) {
		super(id, name, basic, gender);
	}

	public Manager(int id, int employeeCount) {
		super(id);
		this.employeeCount = employeeCount;
	}

	public Manager(int id, String name, int employeeCount) {
		super(id, name);
		this.employeeCount = employeeCount;
	}

	public Manager(int id, String name, double basic, int employeeCount) {
		super(id, name, basic);
		this.employeeCount = employeeCount;
	}

	public Manager() {
		super();
	}

}
