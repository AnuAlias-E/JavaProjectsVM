package pack1;

public class RegionalManager extends Manager {
	private String regionName;

	public RegionalManager(int id, String name, double basic, String gender, int employeeCount, String regionName) {
		super(id, name, basic, gender, employeeCount);
		this.regionName = regionName;
	}

	public RegionalManager(int id, String name, double basic, String gender, String regionName) {
		super(id, name, basic, gender);
		this.regionName = regionName;
	}

	public RegionalManager(int id, int employeeCount, String regionName) {
		super(id, employeeCount);
		this.regionName = regionName;
	}

	public RegionalManager(int id, String name, int employeeCount, String regionName) {
		super(id, name, employeeCount);
		this.regionName = regionName;
	}

	public RegionalManager(int id, String name, double basic, int employeeCount, String regionName) {
		super(id, name, basic, employeeCount);
		this.regionName = regionName;
	}

	public RegionalManager(String regionName) {
		super();
		this.regionName = regionName;
	}

	public RegionalManager(int id, String name, double basic, String gender, int employeeCount) {
		super(id, name, basic, gender, employeeCount);
	}

	public RegionalManager() {
		super();
	}

}
