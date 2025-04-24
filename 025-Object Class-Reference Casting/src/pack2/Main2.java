package pack2;

import pack1.Circle;
import pack1.Employee;
import pack1.Manager;
import pack1.SalesEmployee;

public class Main2 {
public static void main(String[] args) {

	
	Employee e =new Manager();//Reference Casting, upcasting
	e.setId(111);
	//e.empCount not get in 
	
	Manager m =new Manager();
	m.setEmpCount(122);
		
	e= new SalesEmployee();//Reference Casting, upcasting
	
	Object obj;
	obj=new Employee();//Reference Casting, upcasting
	obj=new Manager();//Reference Casting, upcasting
	obj=new SalesEmployee();//Reference Casting, upcasting
	obj= new Circle();//Reference Casting, upcasting
}
}
