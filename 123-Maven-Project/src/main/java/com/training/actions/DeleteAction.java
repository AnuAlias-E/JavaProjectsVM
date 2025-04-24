package com.training.actions;

import com.training.service.StudentService;
import com.training.service.StudentServiceImpl;
import com.training.ui.util.ConsoleIO;

public class DeleteAction extends Action {
	boolean status;

	@Override
	public void init() {
		System.out.println("\n\n");
		System.out.println("\t\t Delete Student");
		System.out.println("\t\t ---------------------");
	}

	@Override
	public void execute() {
		int rollNumberToDelete;
		ConsoleIO.prompt("Enter Roll Number to delete");
		rollNumberToDelete = ConsoleIO.intInput();

		StudentService service = new StudentServiceImpl();
		status = service.deleteStudent(rollNumberToDelete);
	}

	@Override
	public void complete() {
		System.out.println("\n\n");
		if (status)
			System.out.println("\t\tDeleting Student Completed Successfully");
		else
			System.out.println("\t\tDeleting Student  Failed");

		System.out.println("\n\n");
	}

}