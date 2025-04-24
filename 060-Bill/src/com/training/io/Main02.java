package com.training.io;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

import com.training.model.Bill;

public class Main02 {
	public static void main(String[] args) {
		try {

			InputStream is = new FileInputStream("bill.dat");
			ObjectInputStream ois = new ObjectInputStream(is);
			Bill bi = (Bill) ois.readObject();
			System.out.println(bi);
			bi.printBill();
			ois.close();
			is.close();

		} catch (Throwable e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			System.exit(0);
		}

	}
}
