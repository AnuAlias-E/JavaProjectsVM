package com.training.ui;

import com.training.model.Acceptor;
import com.training.model.Account;
import com.training.model.BillItem;
import com.training.model.Circle;
import com.training.model.Employee;

public class Main06 {
	public static void main(String[] args) {
		Acceptor<Circle> acceptor1;
		acceptor1 = c -> System.out.println(c.getRadius() + "," + c.getArea());
		acceptor1.accept(new Circle(90));
		System.out.println("-----------------------------");
		Acceptor<Account> acceptor2;
		acceptor2 = acc -> System.out.println(acc.getCustomerName().toUpperCase() + "," + acc.getBalance());
		acceptor2.accept(new Account("Anu Alias", 9000.00));
		System.out.println("-----------------------------");
		Acceptor<BillItem> acceptor3;
		acceptor3 = bill -> System.out.println(bill.toString());
		acceptor3.accept(new BillItem("Iphone", 7, 50000.00));
		System.out.println("-----------------------------");
		Acceptor<Employee> acceptor4;
		acceptor4 = emp -> System.out
				.println("Name: " + emp.getName() + ", City Name: " + emp.getCityName().toUpperCase() + ", Gender: "
						+ emp.getGender().toUpperCase() + ", NetSalary: " + emp.getNetSalary());
		acceptor4.accept(new Employee(101, "Anu Alias", "female", "Kochi", 10000.00));
	}
}
