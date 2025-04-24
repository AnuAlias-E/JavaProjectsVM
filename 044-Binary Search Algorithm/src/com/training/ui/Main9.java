package com.training.ui;

import java.util.Arrays;
import java.util.Comparator;

import com.training.model.Account;
import com.training.model.comparators.AccountCustomerNameComparator;

public class Main9 {
	public static void main(String[] args) {

		Account account = new Account("Renju", 5000.00);
		Account[] accounts = { new Account("Anju Sebastian", 4000.00), new Account("Anu Alias", 3000.00),
				new Account("Manu", 7000.00), account };
		System.out.println("Accounts Details");
		System.out.println(Arrays.toString(accounts));
		Arrays.sort(accounts, new AccountCustomerNameComparator());
		System.out.println("-------------------------------");

		System.out.println("-----------Name Comparator Search---------------");
		Account searchObject = new Account("Anu Alias", 4000.00);
		int nameSearchResult = nameSearch(accounts, searchObject);
		if (nameSearchResult == -1)
			System.out.println("Search account with name " + searchObject.getCustomerName()
					+ " is not found and the searchResult is " + nameSearchResult);
		else
			System.out.println("Search account with name " + searchObject.getCustomerName()
					+ " is present at position : " + nameSearchResult);
		System.out.println("---------------------------");

		searchObject = new Account("Manoj", 3000.00);
		nameSearchResult = nameSearch(accounts, searchObject);
		if (nameSearchResult == -1)
			System.out.println("Search account with customer name " + searchObject.getCustomerName()
					+ " is not found and the searchResult is " + nameSearchResult);
		else
			System.out.println("Search account with customer name " + searchObject.getCustomerName()
					+ " is present at position : " + nameSearchResult);
		System.out.println("---------------------------");
	}

	private static int nameSearch(Account[] accounts, Account searchObject) {

		Comparator nameComparator = new AccountCustomerNameComparator();
		int low = 0, high = accounts.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int r = nameComparator.compare(accounts[mid], searchObject);
			if (r == 0)
				return mid;

			if (r < 0)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;

	}
}
