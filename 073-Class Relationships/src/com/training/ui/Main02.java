package com.training.ui;

import com.training.model.Contact;
import com.training.model.Manager;
import com.training.model.PreviousCompany;

public class Main02 {
	public static void main(String[] args) {
		Contact contact = new Contact("arjun@gmail.com", "7378288812");
		PreviousCompany previousCompany = new PreviousCompany("TCS", "Senior Developer", 5, 35000.00);
//1056, "Arjun", 'A', "Male", 50000.00, contact, previousCompany, 50
		Manager manager = new Manager();
		manager.setId(1056);
		manager.setName("Arjun");
		manager.setGrade('A');
		manager.setGender("Male");
		manager.setBasicSalary(50000.00);
		manager.setContactInfo(contact);
		manager.setPreviousCompany(previousCompany);
		manager.setEmployeeCount(50);
		System.out.println(manager.toString());
	}
}
