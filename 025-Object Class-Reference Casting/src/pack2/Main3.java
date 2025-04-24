package pack2;

import pack1.Accountant;
import pack1.Circle;
import pack1.Employee;
import pack1.Manager;
import pack1.SalesEmployee;
import pack1.Square;
import pack1.Student;

public class Main3 {
	public static void print1(Circle c) {
		System.out.println(c.getRadius());
	}

	public static void print2(Employee e) {
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getBasic());
		if (e instanceof Manager) {
			Manager m = (Manager) e;// reference Casting,down casting ,explicit
			System.out.println(m.getEmpCount());
		}
		if (e instanceof SalesEmployee) {
			SalesEmployee sales = (SalesEmployee) e;// reference Casting,down casting ,explicit
			System.out.println(sales.getAreaName());
		}
		if (e instanceof Accountant) {
			Accountant acc = (Accountant) e;
			System.out.println(acc.isAuditor());
		}
	}

	public static void print3(Object o) {
		if (o instanceof Circle) {
			Circle c = (Circle) o;
			System.out.println(c.getRadius());
		}
		if (o instanceof Employee) {
			Employee e = (Employee) o;
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getBasic());
		}
		if (o instanceof Manager) {
			Manager m = (Manager) o;
			System.out.println(m.getEmpCount());
		}
		if (o instanceof SalesEmployee) {
			SalesEmployee s = (SalesEmployee) o;
			System.out.println(s.getAreaName());
		}
		if (o instanceof Accountant) {
			Accountant a = (Accountant) o;
			System.out.println(a.isAuditor());
		}
		
		if (o instanceof Student) {
			Student a = (Student) o;
			System.out.println("Roll NO: "+a.getRollNumber());
			System.out.println("Name: "+a.getName());
			System.out.println("Mark1: "+a.getMark1());
			System.out.println("Mark2: "+a.getMark2());
			a.getTotal();
		}
		
		if(o instanceof Square) {
			Square s=(Square)o;
			System.out.println("Size: "+s.getSize());
			System.out.println("Area: "+s.getArea());
		}

	}

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.radius = 90;
		print1(c1);

		Employee e = new Employee(101, "Ram", 3000);
		print2(e);
		System.out.println("--------------------------------");
		Manager m = new Manager(102, "Sam", 40000, 10);
		print2(m);
		System.out.println("--------------------------------");
		SalesEmployee salesEmployee = new SalesEmployee();
		salesEmployee.setId(103);
		salesEmployee.setName("Anju");
		salesEmployee.setBasic(7000);
		salesEmployee.setAreaName("Cochin");

		print2(salesEmployee);
		System.out.println("--------------------------------");

		Accountant acc = new Accountant();
		acc.setId(104);
		acc.setName("Anu");
		acc.setBasic(9000);
		acc.setAuditor(true);
		print2(acc);

		System.out.println("--------------------------------");
		System.out.println("----------*****************----------");
		print3(c1);
		System.out.println("--------------------------------");
		print3(e);
		System.out.println("--------------------------------");
		print3(m);
		System.out.println("--------------------------------");
		print3(salesEmployee);
		System.out.println("--------------------------------");
		print3(acc);
		
		
		Student student1 = new Student(1000,"Maria",90,87);
		System.out.println("--------------------------------");
		System.out.println("Student Details");
		print3(student1);
		System.out.println("--------------------------------");
		
		Square square1 = new Square();
		System.out.println("Square With Default Constructor");
		square1.setSize(10);
		print3(square1);
		System.out.println("--------------------------------");
		Square square2 = new Square(30);
		System.out.println("Square With parameterised Constructor");
		print3(square2);
	}
}
