package com.training.ui;

import com.training.dp.Account;
import com.training.dp.AccountCreator;
import com.training.dp.ConcreteCountryAccountcreator;
import com.training.dp.CountryAccountCreator;

public class Main01 {

	public static void main(String[] args) {
		CountryAccountCreator countryAccountCreator = new ConcreteCountryAccountcreator();
		System.out.println("USA Account Details");
		AccountCreator usaAccountCreator = countryAccountCreator.create("USA");
		Account savingsAccount = usaAccountCreator.createAccount("Savings");
		savingsAccount.deposit(30000.00);
		savingsAccount.withdraw(5000.00);
		System.out.println(savingsAccount);

		Account currentAccount = usaAccountCreator.createAccount("Current");
		currentAccount.deposit(45000.00);
		currentAccount.withdraw(8000.00);
		System.out.println(currentAccount);

		Account fixedDepoAccount = usaAccountCreator.createAccount("Fixed");
		fixedDepoAccount.deposit(789200.00);
		fixedDepoAccount.withdraw(50031.00);
		System.out.println(fixedDepoAccount);
		System.out.println(".....................................................");
		System.out.println("Indian Account Details");
		AccountCreator indiaAccountCreator = countryAccountCreator.create("India");
		Account indiaSavAccount = indiaAccountCreator.createAccount("Savings");
		indiaSavAccount.deposit(2000.00);
		indiaSavAccount.withdraw(1000.00);
		System.out.println(indiaSavAccount);

		Account indiaCurrentAccount = indiaAccountCreator.createAccount("Current");
		indiaCurrentAccount.deposit(30000.00);
		indiaCurrentAccount.withdraw(8000.00);
		System.out.println(indiaCurrentAccount);

		Account indiaFixedDepoAccount = indiaAccountCreator.createAccount("Fixed");
		indiaFixedDepoAccount.deposit(78000.00);
		indiaFixedDepoAccount.withdraw(5000.00);
		System.out.println(indiaFixedDepoAccount);

		System.out.println(".....................................................");
		System.out.println("UK Account Details");
		AccountCreator ukAaccountCreator = countryAccountCreator.create("UK");
		Account ukSavAccount = ukAaccountCreator.createAccount("Savings");
		ukSavAccount.deposit(2000.00);
		ukSavAccount.withdraw(1000.00);
		System.out.println(ukSavAccount);

		Account ukCurrentAccount = ukAaccountCreator.createAccount("Current");
		ukCurrentAccount.deposit(30000.00);
		ukCurrentAccount.withdraw(8000.00);
		System.out.println(ukCurrentAccount);

		Account ukFixedDepoAccount = ukAaccountCreator.createAccount("Fixed");
		ukFixedDepoAccount.deposit(78000.00);
		ukFixedDepoAccount.withdraw(5000.00);
		System.out.println(ukFixedDepoAccount);

		System.out.println(".....................................................");
		System.out.println("Chinese Account Details");
		AccountCreator chinaAaccountCreator = countryAccountCreator.create("China");
		Account chinaSavAccount = chinaAaccountCreator.createAccount("Savings");
		chinaSavAccount.deposit(2000.00);
		chinaSavAccount.withdraw(1000.00);
		System.out.println(chinaSavAccount);

		Account chinaCurrentAccount = chinaAaccountCreator.createAccount("Current");
		chinaCurrentAccount.deposit(30000.00);
		chinaCurrentAccount.withdraw(8000.00);
		System.out.println(chinaCurrentAccount);

		Account chinaFixedDepoAccount = chinaAaccountCreator.createAccount("Fixed");
		chinaFixedDepoAccount.deposit(78000.00);
		chinaFixedDepoAccount.withdraw(5000.00);
		System.out.println(chinaFixedDepoAccount);
	}
}
