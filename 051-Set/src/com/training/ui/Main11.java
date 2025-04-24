package com.training.ui;

import com.training.model.Bill;

public class Main11 {
public static void main(String[] args) {
	Bill bill = new Bill(123, "Anu");
	bill.addBill("DELL", 2, 35000.00);
	bill.addBill("IPhone", 5, 65000.00);
	bill.addBill("ACER", 4, 49000.00);
	bill.addBill("HP", 1, 55000.00);
	
	bill.printBill();
}
}
