package com.training.actions;

import com.training.model.Customer;
import com.training.service.CustomerService;
import com.training.service.CustomerServiceImpl;
import com.training.ui.util.ConsoleIO;

public class SearchAction extends Action {

	@Override
	public void init() {
		System.out.println("\n\n");
		System.out.println("\t\t Search Customer");
		System.out.println("\t\t ---------------------");

	}

	@Override
	public void execute() {
		int searchCustomerId;
		ConsoleIO.prompt("Enter Customer ID to Search");
		searchCustomerId = ConsoleIO.intInput();

		CustomerService service = new CustomerServiceImpl();
		System.out.println();
		Customer customer = service.searchCustomer(searchCustomerId);
		if (customer != null) {
			ConsoleIO.prompt("Customer ID");
			System.out.println(customer.getCustomerId());
			ConsoleIO.prompt("Name");
			System.out.println(customer.getName());
			ConsoleIO.prompt("Customer Balance");
			System.out.println(customer.getBalance());
			ConsoleIO.prompt("Customer Email");
			System.out.println(customer.getEmail());
			ConsoleIO.prompt("Customer Phone No");
			System.out.println(customer.getPhoneNo());

		} else {
			System.out.println("\n\n\t\t Customer Not Found !!!");
		}
	}

	@Override
	public void complete() {
		System.out.println("\t\tSearching Customer Completed");
		System.out.println("\n\n");
	}

}
