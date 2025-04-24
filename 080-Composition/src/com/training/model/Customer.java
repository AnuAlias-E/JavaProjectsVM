package com.training.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	// can take o or more loans
	private int id;
	private String name;
	private String dateOfBrith;
	private Contact contact;
	private Address address;
	private Account account;
	private char accType;
	private List<Loan> loans;

	public Customer() {
		super();
	}

	public Customer(int id, String name, String dateOfBrith, String emailId, String phoneNo, Address address,
			char accType, String accountNo, double balance) {
		this.id = id;
		this.name = name;
		this.dateOfBrith = dateOfBrith;
		this.contact = new Contact(emailId, phoneNo);
		this.address = address;
		this.loans = new ArrayList<>();
		setAccType(accType, accountNo, balance);

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

	public char getAccType() {
		return accType;
	}

	public void setAccType(char accType, String accountNo, double balance) {
		this.accType = accType;
		if (accType == 'S')
			this.account = new SavingsAccount(accountNo, balance);
		if (accType == 'C')
			this.account = new CurrentAccount(accountNo, balance);

	}

	public List<Loan> getLoans() {
		return loans;
	}

	public void addLoans(Loan loan) {
		this.loans.add(loan);
	}

	public Account getAccount() {
		return account;
	}

	@Override
	public String toString() {
		return "\nCustomer [id=" + id + ", name=" + name + ", dateOfBrith=" + dateOfBrith + ", contact=" + contact
				+ ", address=" + address + ", account=" + account + ", loans=" + loans + "]";
	}

	public abstract class Loan {
		//
		// add getInterestRate abstract
		// getInterestAmount()
		// getTotalRepayable
		// getEMI

		protected int loadId;
		protected double loanAmount;
		protected int duration;

		public Loan(int loadId, double loanAmount, int duration) {
			this.loadId = loadId;
			this.loanAmount = loanAmount;
			this.duration = duration;
		}

		@Override
		public String toString() {
			return "Loan [loadId=" + loadId + ", loanAmount=" + loanAmount + ", duration=" + duration + "]";
		}

		public int getLoadId() {
			return loadId;
		}

		public void setLoadId(int loadId) {
			this.loadId = loadId;
		}

		public double getLoanAmount() {
			return loanAmount;
		}

		public void setLoanAmount(double loanAmount) {
			this.loanAmount = loanAmount;
		}

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}

		public abstract double getInterestRate();

		public double getInterestAmount() {
			SimpleCalculator calculator = new SimpleCalculator();
			double interestAmount = calculator.multiply(this.loanAmount,
					calculator.divide(this.getInterestRate(), 100));
			interestAmount = calculator.multiply(interestAmount, calculator.divide(this.getDuration(), 12));
			return interestAmount;
		}

		public double getTotalRepayable() {
			SimpleCalculator calculator = new SimpleCalculator();
			return calculator.add(loanAmount, this.getInterestAmount());

		}

		public double getEMI() {
			SimpleCalculator calculator = new SimpleCalculator();
			return calculator.divide(this.getTotalRepayable(), calculator.multiply(12, duration));

		}

	}

	public class PersonalLoan extends Loan {

		public PersonalLoan(int loadId, double loanAmount, int duration) {
			super(loadId, loanAmount, duration);
		}

		@Override
		public double getInterestRate() {
			return 15.0;
		}

	}

	public class HomeLoan extends Loan {

		public HomeLoan(int loadId, double loanAmount, int duration) {
			super(loadId, loanAmount, duration);
		}

		@Override
		public double getInterestRate() {
			return 10.0;
		}

	}

	public class Contact {
		private String emailId;
		private String phoneNumber;

		public Contact(String emailId, String phoneNumber) {
			this.emailId = emailId;
			this.phoneNumber = phoneNumber;
		}

		@Override
		public String toString() {
			return "\nContact [emailId=" + emailId + ", phoneNumber=" + phoneNumber + "]";
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

	}

	public interface Account {
		void deposit(double amount) throws Exception;

		void withDraw(double amount) throws Exception;
	}

	public class SavingsAccount implements Account {

		private String accountNo;
		private double balance;

		public SavingsAccount(String accountNo, double balance) {
			super();
			this.accountNo = accountNo;
			this.balance = balance;
		}

		@Override
		public String toString() {
			return "\nSavingsAccount [accountNo=" + accountNo + ", balance=" + balance + "]";
		}

		public String getAccountNo() {
			return accountNo;
		}

		public void setAccountNo(String accountNo) {
			this.accountNo = accountNo;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		@Override
		public void deposit(double amount) throws Exception {
			SimpleCalculator calculator = new SimpleCalculator();
			this.balance = calculator.add(this.balance, amount);
			System.out.println("Depositing " + amount);
			System.out.println("------------------------------");
			System.out.println("Balance Amount: " + this.balance);

		}

		@Override
		public void withDraw(double amount) throws Exception {
			SimpleCalculator calculator = new SimpleCalculator();
			this.balance = calculator.subtract(this.balance, amount);
			System.out.println("Withdrawing " + amount);
			System.out.println("------------------------------");
			System.out.println("Balance Amount: " + this.balance);
		}

	}

	public class CurrentAccount implements Account {

		private String accountNo;
		private double balance;

		public CurrentAccount(String accountNo, double balance) {
			super();
			this.accountNo = accountNo;
			this.balance = balance;
		}

		public String getAccountNo() {
			return accountNo;
		}

		public void setAccountNo(String accountNo) {
			this.accountNo = accountNo;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		@Override
		public void deposit(double amount) throws Exception {
			SimpleCalculator calculator = new SimpleCalculator();
			this.balance = calculator.add(this.balance, amount);

			System.out.println("------------------------------");
			System.out.println("Current Account Balance after deposit the amount " + amount);
			System.out.println("------------------------------");
			System.out.println("Balance Amount: " + this.balance);
			System.out.println("------------------------------");

		}

		@Override
		public void withDraw(double amount) throws Exception {
			SimpleCalculator calculator = new SimpleCalculator();
			this.balance = calculator.subtract(this.balance, amount);
			System.out.println("------------------------------");
			System.out.println("Current Account Balance after deposit the amount " + amount);
			System.out.println("------------------------------");
			System.out.println("Balance Amount : " + this.balance);
			System.out.println("------------------------------");
		}

		@Override
		public String toString() {
			return "\nCurrentAccount [accountNo=" + accountNo + ", balance=" + balance + "]";
		}

	}

}
