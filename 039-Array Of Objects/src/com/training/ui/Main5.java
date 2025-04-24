package com.training.ui;

import com.training.model.BillItem;
import com.training.model.Circle;
import com.training.model.Employee;
import com.training.model.Manager;
import com.training.model.SalesEmployee;
import com.training.model.Square;

public class Main5 {
	public static void main(String[] args) {
		Object[] arr = new Object[6];
		

		Circle c = new Circle(10);		
		Square s = new Square(20);
		BillItem b = new BillItem("Redmi", 3, 14000.00);
		Employee employee = new Employee(104, "Menaka", "FEMALE", "Cochin", 1000.0);
		Manager manager = new Manager(101, "Ram", "MALE", "Mumbai", 1000.00, 12);
		SalesEmployee salesEmployee = new SalesEmployee(102, "Dinesh", "MALE", "Delhi", 1000.00, 100000.00);
		
		arr[0]=c;
		arr[1]=s;
		arr[2]=b;
		arr[3]=employee;
		arr[4]=manager;
		arr[5]=salesEmployee;
		for(Object obj:arr) {
			//System.out.println(obj.toString());
			
			if(obj instanceof Circle)
			{
				System.out.println("Circle Details: ");
				Circle temp= (Circle)obj;
				System.out.println("Radius: "+temp.getRadius());
				System.out.println("Area: "+temp.getArea());
				System.out.println("---------------------------------------");
			}
			if(obj instanceof Square)
			{
				System.out.println("Square Details: ");
				Square temp= (Square)obj;
				System.out.println("Size: "+temp.getSize());
				System.out.println("Area: "+temp.getArea());
				System.out.println("---------------------------------------");
			}
			if(obj instanceof BillItem)
			{
				System.out.println("Bill Item Details: ");
				BillItem temp= (BillItem)obj;
				System.out.println(temp.toString());
				System.out.println("Employee Count: "+temp.getItemValue());
				System.out.println("---------------------------------------");
			}
			if(obj instanceof Employee)
			{
				System.out.println("Employee Details: ");
				Employee temp= (Employee)obj;
				System.out.println(temp.toString());
				System.out.println("---------------------------------------");
				
			}
			if(obj instanceof Manager)
			{
				System.out.println("Manager Details: ");
				Manager temp= (Manager)obj;
				System.out.println(temp.toString());
				System.out.println("Employee Count: "+temp.getEmployeeCount());
				System.out.println("---------------------------------------");
			}
			if(obj instanceof SalesEmployee)
			{
				System.out.println("Sales Employee Details: ");
				SalesEmployee temp= (SalesEmployee)obj;
				System.out.println(temp.toString());
				System.out.println("Sales Amount: "+temp.getSalesAmount());
				System.out.println("---------------------------------------");
			}
		}
	}
}
