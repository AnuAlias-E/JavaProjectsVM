package com.training.model;

public class AccountAcceptor implements Acceptor<Account>{

	@Override
	public void accept(Account obj) {
		System.out.println(obj.getCustomerName()+","+obj.getBalance());
		
	}

}
