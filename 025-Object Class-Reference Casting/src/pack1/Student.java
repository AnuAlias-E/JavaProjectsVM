package pack1;

public class Student {
	public int rollNumber;
	public String name;
	public int mark1, mark2;
	
	
	
	public Student() {
		super();
	}
	
	public Student(int rollNumber, String name, int mark1, int mark2) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark1() {
		return mark1;
	}
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	
	public void getTotal() {
		int total = mark1+mark2;
		System.out.println("Total : "+total);
	}
	
}
