
public class EmployeeClient {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(100);
		e1.setName("Anu");
		e1.setCityName("Kochi");
		e1.setBasic(1000.00);
		e1.setGrade('A');

		System.out.println("Employee 1 details");
		System.out.println("ID:" + e1.getId());
		System.out.println("NAME:" + e1.getName());
		System.out.println("CITY:" + e1.getCityName());
		System.out.println("BASIC:" + e1.getBasic());
		System.out.println("GRADE:" + e1.getGrade());
		System.out.println("****************");
		Employee e2 = new Employee(102, "Radhika", "Delhi", 20000, 'B');

		System.out.println("Employee 2 details");
		System.out.println("ID:" + e2.getId());
		System.out.println("NAME:" + e2.getName());
		System.out.println("CITY:" + e2.getCityName());
		System.out.println("BASIC:" + e2.getBasic());
		System.out.println("GRADE:" + e2.getGrade());
		
		Employee e3= new Employee(103, null, null, -90, 'D');

		System.out.println("Employee 2 details");
		System.out.println("ID:" + e3.getId());
		System.out.println("NAME:" + e3.getName());
		System.out.println("CITY:" + e3.getCityName());
		System.out.println("BASIC:" + e3.getBasic());
		System.out.println("GRADE:" + e3.getGrade());
	}
}
