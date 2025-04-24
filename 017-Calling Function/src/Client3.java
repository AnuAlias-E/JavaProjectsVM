
public class Client3 {
	public static void test3(Employee e) {
		System.out.println("In test3 before changes");
		e.display();
		System.out.println("--------------------------");
		e.id = e.id + 1;
		e.name = "Manju";
		e.age = 50;
		System.out.println("In test3 after changes");
		e.display();
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.id = 1001;
		emp.name = "Anu Alias";
		emp.age = 35;

		System.out.println("Main before Function Call");
		emp.display();
		System.out.println("--------------------------");
		test3(emp);
		System.out.println("--------------------------");
		System.out.println("Main after Function Call");
		emp.display();
	}
}
