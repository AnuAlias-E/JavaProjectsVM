package com.training.model;

public class BillItemAcceptor implements Acceptor<BillItem>{

	@Override
	public void accept(BillItem obj) {
		System.out.println(obj.getItemName()+","+obj.getItemValue());
		
	}

}
