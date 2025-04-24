public class Client {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.setId(100);
		manager.setName("Ram");
		manager.setGender("Male");
		manager.setBascicSalary(100000);
		manager.setEmployeeCount(60);
		System.out.println("Manager Details");
		System.out.println("ID:" + manager.getId());
		System.out.println("NAME:" + manager.getName());
		System.out.println("GENDER:" + manager.getGender());
		System.out.println("NET SALARY:" + manager.getNetSalary());
		System.out.println("EMPLOYEE COUNT:" + manager.getEmployeeCount());
		System.out.println("--------------------------------------------");
		System.out.println("Sales Employee Details");
		SalesEmployee salesEmployee = new SalesEmployee();

		salesEmployee.setId(200);
		salesEmployee.setName("Nithin");
		salesEmployee.setGender("Male");
		salesEmployee.setBascicSalary(10000);
		salesEmployee.setSalesAreaName("Kochi");
		System.out.println("ID:" + salesEmployee.getId());
		System.out.println("NAME:" + salesEmployee.getName());
		System.out.println("GENDER:" + salesEmployee.getGender());
		System.out.println("NET SALARY:" + salesEmployee.getNetSalary());
		System.out.println("SALES AREA NAME:" + salesEmployee.getSalesAreaName());
	}

}
