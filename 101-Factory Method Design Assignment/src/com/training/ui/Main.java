package com.training.ui;

import com.training.model.Account;
import com.training.model.AccountFactory;

public class Main {
	public static void main(String[] args) {
		AccountFactory accountFactory1 = new AccountFactory();
		accountFactory1.setAccType("Savings");
		Account savingAcc = accountFactory1.createAccount();
		savingAcc.setBalance(20000.00);
		savingAcc.deposit(5000.00);
		savingAcc.withdraw(3000.00);
		System.out.println(savingAcc);
		System.out.println("----------------------------------------");
		AccountFactory accountFactory2 = new AccountFactory();
		accountFactory2.setAccType("Current");
		Account currentAcc = accountFactory2.createAccount();
		currentAcc.setBalance(50000.00);
		currentAcc.deposit(10000.00);
		currentAcc.withdraw(4000.00);
		System.out.println(currentAcc);
		System.out.println("----------------------------------------");
		AccountFactory accountFactory3 = new AccountFactory();
		accountFactory3.setAccType("Fixed");
		Account fixedAcc = accountFactory3.createAccount();
		fixedAcc.setBalance(78000.00);
		fixedAcc.deposit(6000.00);
		fixedAcc.withdraw(20000.00);
		System.out.println(fixedAcc);
	}
}
