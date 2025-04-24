package com.training.ui;

import com.training.model.BillItem;

public class Main3 {
	public static void main(String[] args) {

		BillItem b1 = new BillItem("Redmi", 3, 14000.00);
		BillItem[] billItems = { new BillItem("Samsung", 2, 15000.00),
				new BillItem("OPPO", 4, 20000.00),
				new BillItem("IPhone", 4, 24000.00),
				b1 };
		double sum=0.00;
		
		for(BillItem billItem: billItems) {
			System.out.println(billItem);
			sum+=billItem.getItemValue();
		}
		System.out.println("Total Bill: "+sum);
		billItems=null;
		b1=null;
	}
}
