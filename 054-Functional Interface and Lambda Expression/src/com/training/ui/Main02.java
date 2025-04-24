package com.training.ui;

import com.training.model.Acceptor;
import com.training.model.Account;
import com.training.model.AccountAcceptor;
import com.training.model.BillItem;
import com.training.model.BillItemAcceptor;
import com.training.model.Circle;
import com.training.model.CircleAcceptor;

public class Main02 {
	public static void main(String[] args) {
		Acceptor<Circle> acceptor = new CircleAcceptor();
		acceptor.accept(new Circle(10));

		Acceptor<Account> acceptor1 = new AccountAcceptor();
		acceptor1.accept(new Account("Anu Alias", 10000.00));

		Acceptor<BillItem> acceptor2 = new BillItemAcceptor();
		acceptor2.accept(new BillItem("Iphone", 10, 57000.00));
	}
}
