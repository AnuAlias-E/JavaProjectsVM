package com.training.actions;

import com.training.model.Student;
import com.training.model.StudentService;
import com.training.service.StudentServiceImpl;
import com.training.ui.util.ConsoleIO;

public class AddAction extends Action {

	@Override
	public void init() {
		System.out.println("\n\n");
		System.out.println("\t\t Add New Student");
		System.out.println("\t\t ---------------------");
		System.out.println("\n");
	}

	@Override
	public void execute() {
		try {
			System.out.println("\t\tAdding a Student");
			int rollNumber;
			String name;
			char gender;
			int mark11, mark2;
			ConsoleIO.prompt("Enter Roll Number");
			rollNumber = ConsoleIO.intInput();
			ConsoleIO.prompt("Enter Name");
			name = ConsoleIO.stringInput();
			ConsoleIO.prompt("Enter Gender (M/F)");
			gender = ConsoleIO.charInput();
			ConsoleIO.prompt("Enter Mark1");
			mark11 = ConsoleIO.intInput();
			ConsoleIO.prompt("Enter Mark2");
			mark2 = ConsoleIO.intInput();
			Student student = new Student(rollNumber, name, gender, mark11, mark2);

			StudentService service = StudentServiceImpl.getInstance();
			service.addStudent(student);
		} catch (Exception e) {
			System.err.println("\t\tError Occured : " + e.getMessage());
		}

	}

	@Override
	public void complete() {
		System.out.println("\t\tAdding Student Completed");

	}

}
