package com.training.actions;

import com.training.model.Customer;
import com.training.service.CustomerService;
import com.training.service.CustomerServiceImpl;
import com.training.ui.util.ConsoleIO;

public class UpdateAction extends Action {

	boolean status;

	@Override
	public void init() {
		System.out.println("\t\t Update Customer");
		System.out.println("\t\t ---------------------");
	}

	@Override
	public void execute() {
		try {
			int customerId;
			String name;
			double balance;
			String email, phoneNo;
			ConsoleIO.prompt("Enter Customer ID");
			customerId = ConsoleIO.intInput();
			ConsoleIO.prompt("Enter Name");
			name = ConsoleIO.stringInput();
			ConsoleIO.prompt("Enter Customer Balance");
			balance = ConsoleIO.doubleInput();
			ConsoleIO.prompt("Enter Email");
			email = ConsoleIO.stringInput();
			ConsoleIO.prompt("Enter Phone");
			phoneNo = ConsoleIO.stringInput();
			Customer customer = new Customer(customerId, name, balance, email, phoneNo);
//update to db
			CustomerService service = new CustomerServiceImpl();
			status = service.updateCustomer(customer);
		} catch (Exception e) {
			System.err.println("\t\tError Occured : " + e.getMessage());
		}

	}

	@Override
	public void complete() {
		if (status)
			System.out.println("\t\tUpdating Student Completed Successfully");
		else
			System.out.println("\t\tUpdating Student Failed");

	}

}
