package com.training.ui;

import java.io.ObjectStreamClass;

import com.training.ds.ObjectStack;
import com.training.model.Account;
import com.training.model.BillItem;
import com.training.model.Circle;
import com.training.model.Employee;
import com.training.model.Manager;
import com.training.model.Person;
import com.training.model.SalesEmployee;
import com.training.model.Square;

public class Main8 {
public static void main(String[] args) {
	Integer obj1= Integer.valueOf(100);
	String obj2 = new String("Welcome");
	Circle obj3= new Circle(15);
	Square obj4=new Square(100);
	BillItem obj5=new BillItem("IPhone", 10, 50000.00);
	
	ObjectStack stack = new ObjectStack(20);
	stack.push(obj1);
	stack.push(obj2);
	stack.push(obj3);
	stack.push(obj4);
	stack.push(obj5);
		
	Employee employee = new Employee(101, "Menaka", "FEMALE", "Cochin", 7000.0);
	Manager manager = new Manager(104, "Ram", "MALE", "Mumbai", 2000.00, 12);
	SalesEmployee salesEmployee = new SalesEmployee(102, "Dinesh", "MALE", "Delhi", 3000.00, 100000.00);
	Account account = new Account("Manu", 5000.00);
	Person person =new Person("Anu", 40);
	
	stack.push(employee);
	stack.push(manager);
	stack.push(salesEmployee);
	stack.push(account);
	stack.push(person);
	
	
	System.out.println(stack);

	System.out.println("---------------------");
	System.out.println("---------------------");
	Object r = stack.pop();
	if(r instanceof Person) {
	Person p =(Person)r;
	System.out.println("Removed element: " + p.getAge() + " "+ p.getName());
	}
	
	
	
	if(r instanceof Account) {
		Account a =(Account)r;
	System.out.println("Removed element : " + a.getCustomerName()+" " +a.getBalance());
	} 
	
	

	if(r instanceof SalesEmployee) {
		SalesEmployee saleEmp=(SalesEmployee)r;
	System.out.println("Removed element : " + saleEmp.getName()+" " +saleEmp.getSalesAmount());
	} 
	

	if(r instanceof Manager) {
		Manager manager1 =(Manager)r;
	System.out.println("Removed element : " + manager1.getName()+" " +manager1.getEmployeeCount());
	} 
	

	if(r instanceof Employee) {
		Employee emp =(Employee)r;
	System.out.println("Removed element : " + emp.getName()+" " +emp.getBasic());
	} 
	

	if(r instanceof BillItem) {
		BillItem item =(BillItem)r;
	System.out.println("Removed element : " + item.getItemName()+" " +item.getPrice()+" "+item.getQuantity());
	} 
	
	if(r instanceof Square) {
		Square square =(Square)r;
	System.out.println("Removed element : " + square.getArea());
	} 
	
	if(r instanceof Circle) {
		Circle circle =(Circle)r;
	System.out.println("Removed element : " + circle.getArea());
	} 

	if(r instanceof Integer) {
		Integer integer =(Integer)r;
	System.out.println("Removed element : " + integer.intValue());
	} 
	
	if(r instanceof String) {
		String string =(String)r;
	System.out.println("Removed element : " + string);
	} 
	
	System.out.println(stack);
}
}
