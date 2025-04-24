package com.training.actions;

import com.training.model.Student;
import com.training.model.StudentService;
import com.training.service.StudentServiceImpl;
import com.training.ui.util.ConsoleIO;

public class SearchAction extends Action {

	@Override
	public void init() {
		System.out.println("\n\n");
		System.out.println("\t\t Search Student");
		System.out.println("\t\t ---------------------");

	}

	@Override
	public void execute() {
		int searchRollNumber;
		ConsoleIO.prompt("Enter Roll Number to Search");
		searchRollNumber = ConsoleIO.intInput();

		StudentService service = StudentServiceImpl.getInstance();
		System.out.println();
		Student student = service.searchStudent(searchRollNumber);
		if (student != null) {
			ConsoleIO.prompt("Roll Number");
			System.out.println(student.getRollNumber());
			ConsoleIO.prompt("Name");
			System.out.println(student.getName());
			ConsoleIO.prompt("Gender");
			System.out.println(student.getGender());
			ConsoleIO.prompt("Mark1");
			System.out.println(student.getMark1());
			ConsoleIO.prompt("Mark2");
			System.out.println(student.getMark2());
			ConsoleIO.prompt("Total");
			System.out.println(student.getTotal());
			ConsoleIO.prompt("Average");
			System.out.println(student.getAverage());

		} else {
			System.out.println("\n\n\t\t Student Not Found !!!");
		}
	}

	@Override
	public void complete() {
		System.out.println("\t\tSearching Student Completed");
		System.out.println("\n\n");
	}

}
