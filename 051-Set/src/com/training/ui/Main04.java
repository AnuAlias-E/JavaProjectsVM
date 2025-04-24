package com.training.ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.training.model.Account;

public class Main04 {
	public static void main(String[] args) {
		Set<Account> accSet = new HashSet<>();
		accSet.add(new Account("Anu Alias", 2000.00));
		accSet.add(new Account("Reshmi", 4000));
		accSet.add(new Account("Nimmi", 3000.00));
		accSet.add(new Account("Anju", 7000.00));
		accSet.add(new Account("Sara", 5000.00));
		accSet.add(new Account("Renju", 2500.00));

		System.out.println(accSet);

		Account searchAcc = new Account("Reshmi", 4000);
		System.out.println(accSet.contains(searchAcc));
		accSet.remove(new Account("Anju", 7000.00));
		System.out.println(accSet);

		double sum = 0.0;
		Iterator<Account> it = accSet.iterator();
		while (it.hasNext()) {
			Account acc = it.next();
			sum += acc.getBalance();
		}
		System.out.println("Sum: " + sum);
	}
}
