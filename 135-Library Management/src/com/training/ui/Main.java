package com.training.ui;

import com.training.model.LibraryManagement;

public class Main {
public static void main(String[] args) {
	LibraryManagement management = new LibraryManagement();
	management.issueBook("Blue Umbrella");
	management.issueBook("Charlottes web");
	management.printAvailableBook();
	System.out.println("The number of available books "+management.getAvailableBooksCount());
	System.out.println("The number of issued books "+management.getIssuedBooksCount());
	management.issueBook("Matilda");
	management.printAvailableBook();
	System.out.println("The number of available books "+management.getAvailableBooksCount());
	System.out.println("The number of issued books "+management.getIssuedBooksCount());
}
}
