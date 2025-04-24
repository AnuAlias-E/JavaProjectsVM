package pack2;

import pack1.Employee;

public class Main7 {
	public static void main(String[] args) {
		Employee emp = new Employee(45632, "RAJU", 2000, 'A');
		Employee emp1 = new Employee(10231, "RAJU", 2000, 'A');
		Employee emp3 = new Employee(45632, "Niiy", 2000, 'B');
		System.out.println(emp);
		System.out.println(emp.equals(emp1));
		System.out.println(emp.equals(emp3));
	}
}
