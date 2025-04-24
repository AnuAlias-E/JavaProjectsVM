package com.training.ui;

import com.training.ui.util.ConsoleIO;

public class MenuHandler {
	public void displayMenu() {
		String[] options = { "Add New Customer", "Search Customer", "Update Customer", "List All Customers",
				"Delete Customer", "Exit" };
		System.out.println("\t\t\t\t MENU");
		for (int i = 0; i < options.length; i++) {
			System.out.println("\t\t" + (i + 1) + "." + options[i]);
		}
	}

	public int getChoice() {
		ConsoleIO.prompt("Enter your Choice");
		int choice = ConsoleIO.intInput();
		return choice;
	}

}
