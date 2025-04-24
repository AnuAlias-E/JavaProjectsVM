package com.training.ui;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.training.model.Account;

public class Main10 {
public static void main(String[] args) {

	List<Account> accounts=new LinkedList<>();
	accounts.add(new Account("Renju", 5000.00));
	accounts.add(new Account("Anju Sebastian", 4000.00));
	accounts.add(new Account("Anu Alias", 3000.00));
	accounts.add(new Account("Manu", 7000.00));
	accounts.add(new Account("Ram", 1000.00));
	System.out.println(accounts.contains(new Account("Ram", 8000.00)));
	
	
}
}
