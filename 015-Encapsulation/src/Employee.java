
public class Employee {

	private int id;
	private String name;
	private String cityName;
	private double basic;
	private char grade;

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
		if(name==null)
		{
			System.out.println("Invalid name");
		}
		this.name = name;
	}

	String getCityName() {
		return cityName;
	}

	void setCityName(String cityName) {
		this.cityName = cityName;
	}

	double getBasic() {
		return basic;
	}

	void setBasic(double basic) {
		if(basic<0) {
			System.out.println("Invalid data");
		}
		this.basic = basic;
	}

	char getGrade() {
		return grade;
	}

	void setGrade(char grade) {
		this.grade = grade;
	}

}
