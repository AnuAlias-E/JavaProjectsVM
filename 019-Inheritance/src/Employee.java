public class Employee {
	private int id;
	private String name;
	private String gender;
	protected double bascicSalary;

	public Employee() {

	}

	public Employee(int id, String name, String gender, double bascicSalary) {

		setId(id);
		setName(name);
		setGender(gender);
		setBascicSalary(bascicSalary);
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

	public double getBascicSalary() {
		return bascicSalary;
	}

	public void setBascicSalary(double bascicSalary) {
		this.bascicSalary = bascicSalary;
	}

	public double getNetSalary() {
		double allowance = bascicSalary * 0.35;
		double tax = bascicSalary * 0.10;
		double net = bascicSalary + allowance - tax;
		return net;

	}

}
