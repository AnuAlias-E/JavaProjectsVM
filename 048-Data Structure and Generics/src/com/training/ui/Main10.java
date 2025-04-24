package com.training.ui;

import com.training.ds.Stack;
import com.training.ds.StackImpl;
import com.training.model.BillItem;

public class Main10 {
	public static void main(String[] args) {
		try {
			Stack<BillItem> stack = new StackImpl<>(-20);

			stack.push(new BillItem("Iphone", 10, 50000.00));
			stack.push(new BillItem("Samsung", 4, 20000.00));
			stack.push(new BillItem("Redmi", 5, 10000.00));
			stack.push(new BillItem("Dell", 7, 75000.00));

			System.out.println(stack);
			System.out.println("---------------------------");
			BillItem billItem1 = stack.pop();
			System.out.println(stack);
			System.out.println("---------------------------");
			System.out.println("Removed Element");
			// System.out.println(billItem1);
			System.out.println(billItem1.getItemName() + " " + billItem1.getQuantity() + " " + billItem1.getPrice()
					+ " " + billItem1.getItemValue());
			System.out.println("---------------------------");
			BillItem billItem2 = stack.pop();
			System.out.println(stack);
			System.out.println("---------------------------");
			System.out.println("Removed Element");
			// System.out.println(billItem2);
			System.out.println(billItem2.getItemName() + " " + billItem2.getQuantity() + " " + billItem2.getPrice()
					+ " " + billItem2.getItemValue());

		} catch (Throwable e) {
			System.err.println(e.getMessage());
		}

	}
}
