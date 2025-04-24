package pack2;

import pack1.Employee;

public class Main3 {
public static void main(String[] args) {
	Employee emp = new Employee(45632, "RAJU", 2000, 'A');
	Employee emp1 = new Employee(45632, "RAJU", 2000, 'A');
			System.out.println(emp);
			System.out.println(emp.equals(emp1));
}
}
