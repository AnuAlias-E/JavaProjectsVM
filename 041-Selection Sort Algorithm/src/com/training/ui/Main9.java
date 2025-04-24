package com.training.ui;

import java.util.Arrays;

import com.training.model.Account;
import com.training.model.BillItem;
import com.training.model.comparators.AccountCustomerNameComparator;
import com.training.model.comparators.BillItemQuantityComparator;

public class Main9 {
	public static void main(String[] args) {
		Account account = new Account("Renju", 5000.00);
		Account[] accounts = { new Account("Anju Sebastian", 4000.00), new Account("Anu Alias", 3000.00),
				new Account("Manu", 7000.00), account };
		System.out.println("Before Sort" + Arrays.toString(accounts));
		AccountCustomerNameComparator nameComparator = new AccountCustomerNameComparator();

		int n = accounts.length;

		int imin;
		for (int i = 0; i < n - 1; i++) {
			imin = i;
			for (int j = i + 1; j < n; j++) {
				int r = nameComparator.compare(accounts[j], accounts[imin]);
				if (r < 0) {
					imin = j;
				}
			}
			Account temp;
			temp = accounts[i];
			accounts[i] = accounts[imin];
			accounts[imin] = temp;

		}

		System.out.println("After Sort: " + Arrays.toString(accounts));
		accounts = null;
	}
}
