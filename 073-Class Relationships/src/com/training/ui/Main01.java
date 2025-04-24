package com.training.ui;

import com.training.model.Contact;
import com.training.model.Employee;
import com.training.model.PreviousCompany;

public class Main01 {
	public static void main(String[] args) {
		Contact contact = new Contact("kiran@gmail.com", "7378288812");
		PreviousCompany previousCompany = new PreviousCompany("Wipro", "Developer", 3, 10000.00);
		Employee emp = new Employee();
		emp.setId(1055);
		emp.setName("Kiran");
		emp.setGrade('A');
		emp.setGender("Male");
		emp.setBasicSalary(20000.00);
		emp.setPreviousCompany(previousCompany);
		emp.setContactInfo(contact);

		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getGrade());
		System.out.println(emp.getGender());
		System.out.println(emp.getBasicSalary());
		System.out.println(emp.getContactInfo().getEmailId());
		System.out.println(emp.getContactInfo().getPhoneNumber());
		System.out.println(emp.getPreviousCompany().getName());
		System.out.println(emp.getPreviousCompany().getDesignation());
		System.out.println(emp.getPreviousCompany().getYears());
		System.out.println(emp.getPreviousCompany().getSalary());

		System.out.println(emp.getAllowance());
		System.out.println(emp.getDeduction());
		System.out.println(emp.getNetSalary());

	}
}
