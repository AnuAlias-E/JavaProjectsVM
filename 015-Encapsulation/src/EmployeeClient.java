
public class EmployeeClient {
public static void main(String[] args) {
	Employee employee = new Employee();
	employee.setId(101);
	employee.setName(null);
	employee.setBasic(1000.00);
	employee.setCityName("Mumbai");
	employee.setGrade('A');
	
	Employee employee1 = new Employee();
	employee1.setId(102);
	employee1.setName("Anju");
	employee1.setBasic(1000.00);
	employee1.setCityName("Mumbai");
	employee1.setGrade('A');
	
	System.out.println(employee1.getId());
	System.out.println(employee1.getName());
	System.out.println(employee1.getCityName());
	System.out.println(employee1.getBasic());
	System.out.println(employee1.getGrade());
}
}
