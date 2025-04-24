package com.training.model;

public class SimplePrinter implements Printer {

	@Override
	public void printDocument() {
		System.out.println("Printing the documents");

	}

	@Override
	public void scanDocument() {
		System.out.println("Not supporting");

	}

	@Override
	public void faxDocument() {
		System.out.println("Not supporting");
	}

}
