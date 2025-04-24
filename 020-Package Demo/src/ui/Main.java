package ui;

import db.AccountDAO;
import db.CustomerDAO;
import db.DBConnectionManager;
import model.Account;
import model.CurrentAccount;
import model.Customer;
import model.SavingAccount;

import model.deposits.FixedDeposit;
import model.deposits.RecurringDeposit;

public class Main {
	public static void main(String[] args) {
		MainScreen ms = new MainScreen();
		CustomerRegistrationScreen crs = new CustomerRegistrationScreen();
		Account account = new Account();
		Customer customer = new Customer();
		SavingAccount savingAccount = new SavingAccount();
		CurrentAccount currentAccount = new CurrentAccount();

		FixedDeposit fixedDeposit = new FixedDeposit();

		RecurringDeposit recurringDeposit = new RecurringDeposit();
		AccountDAO accountDAO = new AccountDAO();
		CustomerDAO customerDAO = new CustomerDAO();
		DBConnectionManager dbConnectionManager = new DBConnectionManager();

	}
}
