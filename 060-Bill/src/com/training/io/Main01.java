package com.training.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.training.model.Bill;
import com.training.util.ConsoleIO;

public class Main01 {
	public static void main(String[] args) throws IOException {
		int billNumber;
		String customerName;

		System.out.println("Enter the Bill Number: ");
		billNumber = ConsoleIO.inputInt();

		System.out.println("Enter the Customer Name: ");
		customerName = ConsoleIO.inputString();

		Bill bill = new Bill(billNumber, customerName);

		char anyMore;
		do {

			String itemName;
			int quantity;
			double price;

			System.out.println("Enter Item Name: ");
			itemName = ConsoleIO.inputString();
			System.out.println("Enter Item quantity: ");
			quantity = ConsoleIO.inputInt();
			System.out.println("Enter Item Price: ");
			price = ConsoleIO.inputDouble();

			bill.addBill(itemName, quantity, price);

			System.out.println("Add More Items? : ");
			anyMore = ConsoleIO.inputChar();

		} while (anyMore == 'Y' || anyMore == 'y');

		bill.printBill();

		OutputStream os = new FileOutputStream("bill.dat");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(bill);

		oos.flush();
		oos.close();
		os.close();
	}
}
