package com.training.actions;

import java.util.List;

import com.training.model.Customer;
import com.training.service.CustomerService;
import com.training.service.CustomerServiceImpl;

public class ListAction extends Action {

	@Override
	public void init() {
		System.out.println("\n\n");
		System.out.println("\t\t List Customer");
		System.out.println("\t\t ---------------------");
	}

	@Override
	public void execute() {
		// implemented
		CustomerService  service = new CustomerServiceImpl();
		List<Customer> studendList = service.getAllCustomers();
		if (studendList == null || studendList.isEmpty()) {
			System.out.println("\n\n\t\t No Customers Found !!!");
		} else {
			System.out.println(
					"\t\t CustomerID\tName\t                  Balance \t EmailId \t\t\t PhoneNo ");
			studendList.stream().forEach((s) -> {
				System.out.printf("\t\t %d\t\t%-20s\t%10.2f \t %-20s \t\t %-20s\t", s.getCustomerId(), s.getName(),
						s.getBalance(), s.getEmail(), s.getPhoneNo());
				System.out.println();
			});
		}
	}

	@Override
	public void complete() {
		System.out.println("\n\n");
		System.out.println("\t\tListing Customers Completed");
		System.out.println("\n\n");
	}

}
