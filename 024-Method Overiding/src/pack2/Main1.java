package pack2;

import pack1.Employee;
import pack1.Manager;

public class Main1 {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.basicSalary = 1000.00;
		//System.out.println(employee.computeNetSalary());
	//	System.out.println(employee.computeAllowance());
		System.out.println(employee.getTax());
		Manager manager =new Manager();
		manager.basicSalary=1000;
		manager.empCount=10;
	//	System.out.println(manager.computeNetSalary());
//		System.out.println(manager.computeAllowance());
		System.out.println(manager.getTax());
		
	
		
	}
}
