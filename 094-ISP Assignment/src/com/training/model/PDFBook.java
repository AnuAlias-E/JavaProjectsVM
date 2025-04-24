package com.training.model;

public class PDFBook implements Book, PrintableBook, MailableBook {

	@Override
	public void emailBook() {
		System.out.println("PDFBook can send via email");

	}

	@Override
	public void printBook() {
		System.out.println("Printing the PDFBook");

	}

	@Override
	public void readBook() {
		System.out.println("Reading the PDFBook");

	}

}
