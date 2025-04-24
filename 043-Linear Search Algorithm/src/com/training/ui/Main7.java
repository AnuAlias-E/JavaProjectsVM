package com.training.ui;

import java.util.Arrays;
import java.util.Comparator;

import com.training.model.Account;
import com.training.model.BillItem;
import com.training.model.comparators.AccountCustomerNameComparator;

public class Main7 {

	public static int search(Account[] accounts, Account searchObject) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].equals(searchObject))
				return i;
		}
		return -1;
	}

	public static int balanceSearch(Account[] accounts, Account searchObject) {
		for (int i = 0; i < accounts.length; i++) {
			if (searchObject instanceof Comparable) {
				Comparable searchData = (Comparable) searchObject;
				int r = accounts[i].compareTo(searchObject);
				if (r == 0)
					return i;
			}
		}
		return -1;
	}

	public static int nameSearch(Account[] accounts, Account searchObject) {
		Comparator customerNameComparator = new AccountCustomerNameComparator();
		for (int i = 0; i < accounts.length; i++) {

			int r = customerNameComparator.compare(accounts[i], searchObject);
			if (r == 0)
				return i;

		}
		return -1;
	}

	public static void main(String[] args) {
		Account account = new Account("Renju", 5000.00);
		Account[] accounts = { new Account("Anju Sebastian", 4000.00), new Account("Anu Alias", 3000.00),
				new Account("Manu", 7000.00), account };
		System.out.println("Accounts Details");
		System.out.println(Arrays.toString(accounts));
		
		System.out.println("-------------------------------");
		System.out.println("-----------Using Equals Search----------------");
		Account searchObject = new Account("Anju Sebastian", 4000.00);
		int searchResult = search(accounts, searchObject);
		if (searchResult == -1)
			System.out.println("Search account with customer name " + searchObject.getCustomerName()
					+ " is not found and the searchResult is " + searchResult);
		else
			System.out.println(
					"Search account with customer name " + searchObject.getCustomerName() + " is present at position : " + searchResult);
		System.out.println("---------------------------");

		searchObject = new Account("Manoj", 4000.00);
		searchResult = search(accounts, searchObject);
		if (searchResult == -1)
			System.out.println("Search account with customer name " + searchObject.getCustomerName()
					+ " is not found and the searchResult is " + searchResult);
		else
			System.out.println(
					"Search account with customer name " + searchObject.getCustomerName() + " is present at position : " + searchResult);
		System.out.println("---------------------------");

		searchObject = new Account("Anju Sebastian", 3000.00);
		int balanceSearchResult = balanceSearch(accounts, searchObject);
		if (balanceSearchResult == -1)
			System.out.println("Search account with balance" + searchObject.getBalance() + " is not found and the searchResult is "
					+ balanceSearchResult);
		else
			System.out.println(
					"Search account with balance " + searchObject.getBalance() + " is present at position : " + balanceSearchResult);
		System.out.println("---------------------------");

		System.out.println("-----------Balance Search---------------");
		searchObject = new Account("Manoj", 12000.00);
		balanceSearchResult = balanceSearch(accounts, searchObject);
		if (balanceSearchResult == -1)
			System.out.println("Search account with balance " + searchObject.getBalance() + " is not found and the searchResult is "
					+ balanceSearchResult);
		else
			System.out.println(
					"Search account with balance " + searchObject.getBalance() + " is present at position : " + balanceSearchResult);
		System.out.println("---------------------------");


		System.out.println("-----------Name Comparator Search---------------");
		searchObject = new Account("Anu Alias", 4000.00);
		int nameSearchResult = nameSearch(accounts, searchObject);
		if (nameSearchResult == -1)
			System.out.println("Search account with name " + searchObject.getCustomerName() + " is not found and the searchResult is "
					+ nameSearchResult);
		else
			System.out.println(
					"Search account with name " + searchObject.getCustomerName() + " is present at position : " + nameSearchResult);
		System.out.println("---------------------------");

		searchObject = new Account("Manoj", 3000.00);
		nameSearchResult = nameSearch(accounts, searchObject);
		if (nameSearchResult == -1)
			System.out.println("Search account with customer name " + searchObject.getCustomerName()
					+ " is not found and the searchResult is " + nameSearchResult);
		else
			System.out.println("Search account with customer name " + searchObject.getCustomerName() + " is present at position : "
					+ nameSearchResult);
		System.out.println("---------------------------");
	}
}
