package com.training.actions;

import java.util.List;

import com.training.model.Student;
import com.training.model.StudentService;
import com.training.service.StudentServiceImpl;

public class ListAction extends Action {

	@Override
	public void init() {
		System.out.println("\n\n");
		System.out.println("\t\t List Student");
		System.out.println("\t\t ---------------------");
	}

	@Override
	public void execute() {
		StudentService service = StudentServiceImpl.getInstance();
		List<Student> studendList = service.getAllStudents();
		if (studendList == null || studendList.isEmpty()) {
			System.out.println("\n\n\t\t No students Found !!!");
		} else {
			System.out.println(
					"\t\t RollNumber\tName                    \tGender \t Mark1 \t Mark2 \t Total \t     Average");
			studendList.stream().forEach((s) -> {
				System.out.printf("\t\t %d\t\t%-20s \t\t%s \t %d \t %d \t %d\t%10.2f", s.getRollNumber(), s.getName(),
						s.getGender(), s.getMark1(), s.getMark2(), s.getTotal(), s.getAverage());
				System.out.println();
			});
		}
	}

	@Override
	public void complete() {
		System.out.println("\n\n");
		System.out.println("\t\tListing Students Completed");
		System.out.println("\n\n");
	}

}
