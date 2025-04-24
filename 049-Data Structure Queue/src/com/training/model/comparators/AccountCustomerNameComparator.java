package com.training.model.comparators;

import java.util.Comparator;

import com.training.model.Account;

public class AccountCustomerNameComparator implements Comparator<Account>{


	@Override
	public int compare(Account o1, Account o2) {
		String c1 = o1.getCustomerName();
		String c2 = o2.getCustomerName();
		int r = c1.compareTo(c2);
		
		return r;
	}

}
