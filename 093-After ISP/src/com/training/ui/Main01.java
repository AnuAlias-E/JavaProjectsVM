package com.training.ui;

import com.training.model.MultiFunctionalityPrinter;
import com.training.model.Printer;
import com.training.model.SimplePrinter;

public class Main01 {
	public static void main(String[] args) {
		Printer printer = new SimplePrinter();
		printer.printDocument();

		MultiFunctionalityPrinter multiFunctionalityPrinter = new MultiFunctionalityPrinter();
		multiFunctionalityPrinter.printDocument();
		multiFunctionalityPrinter = new MultiFunctionalityPrinter();
		multiFunctionalityPrinter.scanDocument();
		multiFunctionalityPrinter = new MultiFunctionalityPrinter();
		multiFunctionalityPrinter.faxDocument();
	}
}
