package com.training.ui;

import java.util.ArrayList;
import java.util.List;

import com.training.model.Address;
import com.training.model.Contact;
import com.training.model.Customer;
import com.training.model.HomeLoan;
import com.training.model.Loan;
import com.training.model.PersonalLoan;
import com.training.model.SavingsAccount;

public class Main01 {
	public static void main(String[] args) {
		Contact contact = new Contact("anu@gmail.com", "7378288812");
		Address address = new Address(567, "StreetNo1", "Kochi", "2345678");
		SavingsAccount savingAcc = new SavingsAccount("1833761671", 0, 500.0);

		Loan personalLoan = new PersonalLoan(789, 100000.00, 8, "11-11-2023");
		Loan homeLoan = new HomeLoan(789, 100000.00, 5, "21-09-2023");

		List<Loan> loans = new ArrayList<>();
		loans.add(homeLoan);
		loans.add(personalLoan);
		Customer customer = new Customer(1010, "Anu Alias", "10-01-1988", contact, address, savingAcc, loans);

		System.out.println("Customer Details");
		System.out.println("Customer ID: " + customer.getId());
		System.out.println("Customer Name: " + customer.getName());
		System.out.println("Customer Date Of Birth: " + customer.getDateOfBrith());
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

		System.out.println(savingAcc.getAccountNo());
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
