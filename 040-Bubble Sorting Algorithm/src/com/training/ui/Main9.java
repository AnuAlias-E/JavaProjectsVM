package com.training.ui;

import java.util.Arrays;

import com.training.model.Account;
import com.training.model.comparators.AccountCustomerNameComparator;

public class Main9 {
public static void main(String[] args) {
	Account account = new Account("Manu", 5000.00);
	Account[] accounts = { new Account("Anju Sebastian", 4000.00), new Account("Anu Alias", 3000.00),
			new Account("Renjini", 7000.00), account };
	System.out.println("Before Sort" + Arrays.toString(accounts));
	AccountCustomerNameComparator nameComparator=new AccountCustomerNameComparator();
	for (int i = 0; i < accounts.length; i++) {

		for (int j = 0; j < accounts.length - i - 1; j++) {
			
			int r = nameComparator.compare(accounts[j],accounts[j + 1]);
			if (r > 0) {// when the current item is greater than next
				Account temp;
				temp = accounts[j];
				accounts[j] = accounts[j + 1];
				accounts[j + 1] = temp;
			}
		}
	}
	System.out.println("After Sort with Name" + Arrays.toString(accounts));
	accounts=null;
	account=null;
}
}
