package com.training.ui;

import java.util.function.Supplier;

import com.training.model.Bill;
import com.training.model.BillItem;
import com.training.model.Circle;
import com.training.model.Department;
import com.training.model.Employee;

public class Main04 {
	public static void main(String[] args) {
		Supplier<Circle> supplier1;
		supplier1 = () -> {
			return new Circle(10);
		};
		System.out.println(supplier1.get());

		Supplier<BillItem> supplier2;
		supplier2 = () -> new BillItem("DELL", 2, 35000.00);
		System.out.println(supplier2.get());

		Supplier<Employee> supplier3;
		supplier3 = () -> new Employee(101, "Anu Alias", "Female", "Kochi", 4000.00);
		System.out.println(supplier3.get());

		Supplier<Bill> supplier4;
		supplier4 = () -> {
			Bill bill = new Bill(123, "Anu");
			bill.addBill("DELL", 2, 35000.00);
			bill.addBill("IPhone", 5, 65000.00);
			return bill;
		};
		Bill latestBill = supplier4.get();
		latestBill.printBill();

		Supplier<Department> supplier5;
		supplier5 = () -> {
			Department department = new Department("IT", "Kiran");

			department.addEmployee(101, "Anju", "Female", "Kochi", 2000.00);
			department.addEmployee(102, "Nivedha", "Female", "Delhi", 1000.00);
			department.addEmployee(103, "Shyam", "Male", "Mumbai", 3000.00);
			department.addEmployee(104, "Dinesh", "Male", "Mumbai", 4000.00);
			department.addEmployee(105, "Sandhya", "Female", "Kochi", 6000.00);
			return department;
		};
		Department latestDept = supplier5.get();
		latestDept.printReport();
	}

}
