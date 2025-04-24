package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.model.CarLoan;
import com.training.model.CollegeEducationLoan;
import com.training.model.EducationLoan;
import com.training.model.HomeLoan;
import com.training.model.Loan;

public class Main01 {

	static void print1(List<Loan> loans) {
		System.out.println(loans);
	}

	// ? means class carloan and sub classes of carloan
	static void print2(List<? extends CarLoan> loans) {
		System.out.println(loans);
	}

	// ? means class EducationLoan and sub classes of EducationLoan
	static void print3(List<? extends EducationLoan> loans) {
		System.out.println(loans);
	}

	// ? means class EducationLoan and super classes of EducationLoan
	static void print4(List<? super EducationLoan> loans) {
		System.out.println(loans);
	}

	// ? means any class type
	static void print5(List<?> loans) {
		System.out.println(loans);
	}

//? means class HomeLoan and sub classes of HomeLoan
	static void print6(List<? extends HomeLoan> loans) {
		System.out.println(loans);
	}

	public static void main(String[] args) {
		List<Loan> loans = new LinkedList<>();
		print1(loans);

		List<CarLoan> carLoans = new LinkedList<>();
		print2(carLoans);

		List<EducationLoan> eLoans = new LinkedList<>();
		print3(eLoans);

		List<CollegeEducationLoan> ceLoans = new LinkedList<>();
		print3(ceLoans);
		print3(loans);// not able to call print3

		print4(eLoans);
		print4(loans);
		print4(ceLoans);

		print5(loans);
		print5(carLoans);
		print5(eLoans);
		print5(ceLoans);

		List<Integer> numList = new LinkedList<>();
		print5(numList);

		List<HomeLoan> hLoans = new LinkedList<>();

		print1(hLoans);// Do not accept , only accept Loan class
		print2(hLoans);// Do not accept , only accept car loan class and the sub classes of carloan
		print3(hLoans);// Do not accept , only accept EducationLoan class and the sub classes of
						// EducationLoan
		print4(hLoans);// Do not accept , only accept EducationLoan class and the super classes of
						// EducationLoan
		print5(hLoans);// it will accept because it can accept any thing

		print6(hLoans);

	}
}
