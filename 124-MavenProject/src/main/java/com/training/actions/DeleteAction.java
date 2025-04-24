package com.training.actions;

import com.training.service.CustomerService;
import com.training.service.CustomerServiceImpl;
import com.training.ui.util.ConsoleIO;

public class DeleteAction extends Action {
	boolean status;

	@Override
	public void init() {
		System.out.println("\n\n");
		System.out.println("\t\t Delete Customer");
		System.out.println("\t\t ---------------------");
	}

	@Override
	public void execute() {
		int rollNumberToDelete;
		ConsoleIO.prompt("Enter Customer Id to delete");
		rollNumberToDelete = ConsoleIO.intInput();

		CustomerService service = new CustomerServiceImpl();
		status = service.deleteCustomer(rollNumberToDelete);
	}

	@Override
	public void complete() {
		System.out.println("\n\n");
		if (status)
			System.out.println("\t\tDeleting Customer Completed Successfully");
		else
			System.out.println("\t\tDeleting Customer  Failed");

		System.out.println("\n\n");
	}

}