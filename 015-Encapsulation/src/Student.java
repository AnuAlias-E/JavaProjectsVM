
public class Student {
	private int rollNumber;
	private String name;
	private int mark1, mark2;
	private String gender;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		if (rollNumber < 0) {
			System.out.println("RollNumber must be positive");
			return;
		}
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null) {
			System.out.println("Invalid name");
			return;
		}
		this.name = name;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		if (mark1 < 0 || mark1 >= 100) {
			System.out.println("Mark1 must be between 0 and 100");
			return;
		}
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		if (mark2 < 0 || mark2 > 100) {
			System.out.println("Mark2 must be between 0 and 100");
			return;
		}

		this.mark2 = mark2;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if (gender != "Male" & gender != "Female") {
			System.out.println("Gender must be Male or Female");
			return;
		}
		this.gender = gender;
	}

}
