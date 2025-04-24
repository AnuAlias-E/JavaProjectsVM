package pack1;

public class Employee {
	private int id;
	private String name;
	private double basic;
	private String gender;

	public Employee() {

	}

	public Employee(int id, String name, double basic, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.basic = basic;
		this.gender = gender;
	}

	public Employee(int id) {
		super();
		this.id = id;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, double basic) {
		super();
		this.id = id;
		this.name = name;
		this.basic = basic;
	}

}
