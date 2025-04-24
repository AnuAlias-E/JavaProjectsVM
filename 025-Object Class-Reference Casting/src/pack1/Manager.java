package pack1;

public class Manager extends Employee {

	int empCount;

	public Manager() {
		super();
	}
	

	public Manager(int id, String name, double basic, int empCount) {
		super(id, name, basic);
		this.empCount = empCount;
	}


	public int getEmpCount() {
		return empCount;
	}


	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}


	
}
