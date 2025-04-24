package com.training.model;

import java.util.List;

public class Customer {
//can take o or more loans
	private int id;
	private String name;
	private String dateOfBrith;
	private Contact contact;
	private Address address;
	private Account account;
	private List<Loan> loans;
	
	public Customer() {
		super();
	}


	public Customer(int id, String name, String dateOfBrith, Contact contact, Address address, Account account,List<Loan> loans) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBrith = dateOfBrith;
		this.contact = contact;
		this.address = address;
		this.account = account;
		this.loans=loans;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDateOfBrith() {
		return dateOfBrith;
	}


	public void setDateOfBrith(String dateOfBrith) {
		this.dateOfBrith = dateOfBrith;
	}


	public Contact getContact() {
		return contact;
	}


	public void setContact(Contact contact) {
		this.contact = contact;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}



	public List<Loan> getLoans() {
		return loans;
	}


	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}


	@Override
	public String toString() {
		return "\nCustomer [id=" + id + ", name=" + name + ", dateOfBrith=" + dateOfBrith + ", contact=" + contact
				+ ", address=" + address + ", account=" + account +", loans=" + loans +  "]";
	}
	
	
	
}
