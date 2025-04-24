package com.training.ui;

import com.training.ds.LinkedList;
import com.training.ds.SimpleListImpl;
import com.training.model.BillItem;

public class Main04 {
	public static void main(String[] args) {

		LinkedList<BillItem> billItems = null;
		billItems = new SimpleListImpl<>();

		try {
			billItems.insert(new BillItem("Dell", 4, 20000.00));
			billItems.insert(new BillItem("Samsung", 7, 35000.00));
			billItems.insert(new BillItem("Iphone", 3, 75000.00));
			billItems.insert(new BillItem("Redmi", 2, 15000.00));
			billItems.insert(new BillItem("Realme", 5, 30000.00));
			billItems.insert(new BillItem("Oppo", 6, 25000.00));
			System.out.println("----------------------------------------------------------------");
			System.out.println("Bill Item Details");
			billItems.display();

			billItems.insert(0, new BillItem("One Plus", 6, 65000.00));
			billItems.insert(4, new BillItem("Google", 1, 55000.00));

			System.out.println("----------------------------------------------------------------");
			System.out.println("Bill Item Details");
			billItems.display();
			BillItem r = billItems.get(0);
			System.out.println("----------------------------------------------------------------");
			System.out.println("BillItem at the position at 0");
			System.out.println(r);

			r = billItems.get(3);
			System.out.println("----------------------------------------------------------------");
			System.out.println("BillItem at the position at 3");
			System.out.println(r);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
