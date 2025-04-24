package com.training.ui;


import com.training.linkedlist.LinkedList;
import com.training.model.Customer;

public class Main {
	public static void main(String[] args) {

		Customer customer1 = new Customer(101, "Anu Alias");
		Customer customer2 = new Customer(102, "Renju P V");
		Customer customer3 = new Customer(103, "Simi Varghese");
		Customer customer4 = new Customer(104, "Anju Sebastain");
		
		Customer customer5 = new Customer(105, "Miya Thomas");
		
		LinkedList<Customer> customerList= new LinkedList<>();
		customerList.addToList(customer1);
		customerList.addToList(customer2);
		customerList.addToList(customer3);
		customerList.addToList(customer4);
		customerList.addToList(customer5);
		
		System.out.println("Customer List");
		customerList.display();
		
		System.out.println("The Count of customerlist is "+customerList.count());
		Customer customer6 = new Customer(106, "Rahul");
		
		customerList.insertAfter(customer2,customer6);
		customerList.display();
}
}