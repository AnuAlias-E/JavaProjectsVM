package com.training.ui;

import java.util.Arrays;

import com.training.model.Account;

public class Main8 {
	public static void main(String[] args) {

		Account account = new Account("Renju", 5000.00);
		Account[] accounts = { new Account("Anju Sebastian", 4000.00), new Account("Anu Alias", 3000.00),
				new Account("Manu", 7000.00), account };
		System.out.println("Accounts Details");
		System.out.println(Arrays.toString(accounts));
		Arrays.sort(accounts);
		System.out.println("-------------------------------");
		
		System.out.println("--------------With Balance-----------------");
		
		Account searchObject = new Account("Anju Sebastian", 3000.00);
		int balanceSearchResult = balanceSearch(accounts, searchObject);
		if (balanceSearchResult == -1)
			System.out.println("Search account with balance" + searchObject.getBalance() + " is not found and the searchResult is "
					+ balanceSearchResult);
		else
			System.out.println(
					"Search account with balance " + searchObject.getBalance() + " is present at position : " + balanceSearchResult);
		System.out.println("---------------------------");

		searchObject = new Account("Manoj", 12000.00);
		balanceSearchResult = balanceSearch(accounts, searchObject);
		if (balanceSearchResult == -1)
			System.out.println("Search account with balance " + searchObject.getBalance() + " is not found and the searchResult is "
					+ balanceSearchResult);
		else
			System.out.println(
					"Search account with balance " + searchObject.getBalance() + " is present at position : " + balanceSearchResult);
		System.out.println("---------------------------");


		
	
	}

	private static int balanceSearch(Account[] accounts, Account searchObject) {
		int low = 0, high = accounts.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int r = accounts[mid].compareTo(searchObject);
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
