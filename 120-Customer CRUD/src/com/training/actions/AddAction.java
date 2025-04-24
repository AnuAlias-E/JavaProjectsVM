package com.training.actions;

import com.training.model.Customer;
import com.training.service.CustomerService;
import com.training.service.CustomerServiceImpl;
import com.training.ui.util.ConsoleIO;

public class AddAction extends Action {
	boolean status;

	@Override
	public void init() {
		System.out.println("\n\n");
		System.out.println("\t\t Add New Customer");
		System.out.println("\t\t ---------------------");
		System.out.println("\n");
	}

	@Override
	public void execute() {
		try {
			System.out.println("\t\tAdding a Customer");
			int id;
			String name;
			double balance;
			String  email, phoneNo;
			ConsoleIO.prompt("Enter Customer ID");
			id = ConsoleIO.intInput();
			ConsoleIO.prompt("Enter Customer Name");
			name = ConsoleIO.stringInput();
			ConsoleIO.prompt("Enter Customer Balance");
			balance = ConsoleIO.doubleInput();
			ConsoleIO.prompt("Enter Customer Email");
			email = ConsoleIO.stringInput();
			ConsoleIO.prompt("Enter Customer Phone No");
			phoneNo = ConsoleIO.stringInput();
			Customer customer = new Customer(id, name, balance, email, phoneNo);
			CustomerService service = new CustomerServiceImpl();
			status = service.addCustomer(customer);

		} catch (Exception e) {
			System.err.println("\t\tError Occured : " + e.getMessage());
		}

	}

	@Override
	public void complete() {
		if (status)
			System.out.println("\t\tAdding Customer Completed Sucessfully");
		else
			System.out.println("\t\tAdding Customer Failed");

	}

}
