package com.training.ui;

import com.training.model.Loan;
import com.training.model.exception.InvalidAmountException;
import com.training.model.exception.InvalidCustomerNameException;
import com.training.model.exception.InvalidLoanIdException;
import com.training.model.exception.InvalidTenureException;

public class Main5 {
	public static void main(String[] args) throws InvalidCustomerNameException {
		System.out.println("Program Begins.....");
		Loan loan = new Loan(124,"",1000,8);
		try {
			//loan.setLoadId(-100);
			//loan.setCustomerName(null);
			//loan.setLoanAmount(-1000);
			loan.setTenure(-10);
		} catch (InvalidLoanIdException  | InvalidAmountException
				| InvalidTenureException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program End.....");
	}
}
