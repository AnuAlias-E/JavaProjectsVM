package com.training.ui;

import com.training.ds.Stack;
import com.training.ds.StackImpl;
import com.training.model.Account;

public class Main11 {
	public static void main(String[] args) {
		try {
		Stack<Account> stack = new StackImpl<>(10);
		stack.push(new Account("Anu Alias",  50000.00));
		stack.push(new Account("Renju P V",  20000.00));
		stack.push(new Account("Myna", 10000.00));
		stack.push(new Account("Rahul",  75000.00));
		stack.push(new Account("ANIL",  70000.00));

		
		System.out.println(stack);
		System.out.println("---------------------------");
		Account account = stack.pop();
		System.out.println(stack);
		System.out.println("---------------------------");
		System.out.println("Removed Element");
		//System.out.println(billItem1);
		System.out.println("Customer Name : "+account.getCustomerName() + ",Balance: " + account.getBalance() );
		System.out.println("---------------------------");
		Account account1 = stack.pop();
		System.out.println(stack);
		System.out.println("---------------------------");
		System.out.println("Removed Element");
		//System.out.println(billItem1);
		System.out.println("Customer Name : "+account1.getCustomerName() +  ",Balance: " + account1.getBalance() );
		System.out.println("---------------------------");
		}catch (Throwable e) {
			System.err.println(e.getMessage());
		}
	}

}
