package com.training.ui;

import com.training.model.Address;
import com.training.model.Customer;
import com.training.model.Customer.Loan;

public class Main01 {
	public static void main(String[] args) {
		Address address = new Address(567, "StreetNo1", "Kochi", "2345678");

		Customer customer = new Customer(1010, "Anu Alias", "10-01-1988", "anu@alias.com", "327732331", address, 'S',
				"1833761671", 10000.00);

		Loan personalLoan = customer.new PersonalLoan(789, 100000.00, 8);

		Loan homeLoan = customer.new HomeLoan(789, 100000.00, 5);

		customer.addLoans(homeLoan);
		customer.addLoans(personalLoan);

		System.out.println("Customer Details");
		System.out.println("ID: " + customer.getId());
		System.out.println("Name: " + customer.getName());
		System.out.println("Date Of Birth: " + customer.getDateOfBrith());
		System.out.println("Account Type: " + customer.getAccType());
		System.out.println("----------------------------------------------");

		System.out.println("Address Details");
		System.out.println("House No:" + customer.getAddress().getHouseNo());
		System.out.println("Street Name: " + customer.getAddress().getStreetName());
		System.out.println("City: " + customer.getAddress().getCity());
		System.out.println("Customer Zipcode: " + customer.getAddress().getZipcode());
		System.out.println("----------------------------------------------");
		System.out.println("Contact Details");
		System.out.println("Email ID: " + customer.getContact().getEmailId());
		System.out.println("Phone Number: " + customer.getContact().getPhoneNumber());
		System.out.println("----------------------------------------------");
		System.out.println("Savings Account Details");

		System.out.println("----------------------------------------------");

		try {
			customer.getAccount().deposit(30000);
			System.out.println("----------------------------------------------");
			customer.getAccount().withDraw(5000.00);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("----------------------------------------------");

		System.out.println("Personal Loan Details");

		for (Loan loan : customer.getLoans()) {
			System.out.println("Loan Id: " + loan.getLoadId());
			System.out.println("Loan Amount: " + loan.getLoanAmount());
			System.out.println("Loan Interest Rate: " + loan.getInterestRate());
			System.out.println("Loan Duration: " + loan.getDuration());
			System.out.println("Total Interest Amount: " + loan.getInterestAmount());
			System.out.println("Total Repayment Amount: " + loan.getTotalRepayable());
			System.out.println("EMI Amount: " + loan.getEMI());

		}

	}
}
