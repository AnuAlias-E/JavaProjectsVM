public class EmployeeClient {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.basicSalary = 20000.00;
		System.out.println("Salary without incentive : "+employee.getSalary());
		System.out.println("----------------------------");
		System.out.println("Salary with incentive : "+employee.getSalary(3000));
		System.out.println("----------------------------");
		System.out.println("Salary with extrahours : "+employee.getSalary(10));
		System.out.println("----------------------------");
		System.out.println("Salary with extrahours for permenent : "+employee.getSalary(true,10));
		System.out.println("----------------------------");
		System.out.println("Salary with extrahours for not permenent : "+employee.getSalary(false,10));
	}
}
