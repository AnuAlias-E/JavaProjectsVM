package com.training.ui;

import com.training.model.CarLoanImpl;
import com.training.model.HomeLoanImpl;
import com.training.model.Loan;

public class Main01 {

	public static void main(String[] args) {
		Loan loan = new HomeLoanImpl(1000000.0, 20, "Kochi");
		loan.printLoanDetails();

		System.out.println("-------------------------------------------");

		loan = new CarLoanImpl(500000.0, 5, "KL-17E-1881");
		loan.printLoanDetails();
	}
}
