package com.training.ui;

import com.training.model.PDFBook;
import com.training.model.SimpleBook;

public class Main01 {
	public static void main(String[] args) {
		SimpleBook simpleBook = new SimpleBook();
		simpleBook.readBook();

		PDFBook pdfBook = new PDFBook();
		pdfBook.readBook();
		pdfBook.printBook();
		pdfBook.emailBook();
	}
}
