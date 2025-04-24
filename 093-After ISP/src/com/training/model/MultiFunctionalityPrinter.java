package com.training.model;

public class MultiFunctionalityPrinter implements Printer, Fax, Scanner {

	@Override
	public void scanDocument() {
		System.out.println("Scanning the Document");

	}

	@Override
	public void faxDocument() {
		System.out.println("Fax the Document");

	}

	@Override
	public void printDocument() {
		System.out.println("Printing the Document");

	}

}
