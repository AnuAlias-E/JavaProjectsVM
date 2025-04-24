
public class Employee {

	private int id;
	private String name;
	private String cityName;
	private double basic;
	private char grade;

	Employee() {
		System.out.println("Default Employee object is created");
	}

	Employee(int id, String name, String cityName, double basic, char grade) {
		setId(id);
		setName(name);
		setCityName(cityName);
		setBasic(basic);
		setGrade(grade);
		System.out.println(
				"Employee object is created with " + id + " " + name + " " + cityName + " " + basic + " " + grade);
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		if (name == null) {
			System.out.println("Invalid name");
			return;
		}
		this.name = name;
	}

	String getCityName() {
		return cityName;
	}

	void setCityName(String cityName) {
		if (cityName == null) {
			System.out.println("Invalid City");
			return;
		}
		this.cityName = cityName;
	}

	double getBasic() {
		return basic;
	}

	void setBasic(double basic) {
		if (basic < 0) {
			System.out.println("Invalid data");
			return;
		}
		this.basic = basic;
	}

	char getGrade() {
		return grade;
	}

	void setGrade(char grade) {
		if (grade != 'A' & grade != 'B' & grade != 'C') {
			System.out.println("Invalid Grade");
			return;
		}
		this.grade = grade;
	}

}
