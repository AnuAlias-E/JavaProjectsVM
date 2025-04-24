package com.training.ui;

import java.util.Arrays;

import com.training.model.Account;
import com.training.model.comparators.AccountCustomerNameComparator;

public class Main9 {
public static void main(String[] args) {
	Account account = new Account("Renju", 5000.00);
	Account[] accounts = { new Account("Anju Sebastian", 4000.00), new Account("Anu Alias", 3000.00),
			new Account("Manu", 7000.00), account };
	System.out.println("Before Sort" + Arrays.toString(accounts));
	int n = accounts.length;
	
	AccountCustomerNameComparator nameComparator = new AccountCustomerNameComparator();
	for (int i = 1; i < n; i++) {
		Account key = accounts[i];
		int j = i - 1;
		int r= nameComparator.compare(accounts[j], key);
		while (j >= 0 && r > 0) {
			accounts[j + 1] = accounts[j];
			j = j - 1;
			if(j>=0) {
				r= nameComparator.compare(accounts[j], key);
			}
		}
		accounts[j + 1] = key;

	}
	System.out.println("After Sort" + Arrays.toString(accounts));
}
}
