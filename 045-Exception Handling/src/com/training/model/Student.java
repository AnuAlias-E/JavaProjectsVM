package com.training.model;

import com.training.model.exception.InvalidGradeException;
import com.training.model.exception.InvalidMarkException;
import com.training.model.exception.InvalidNameException;

public class Student {
	private int mark;
	private String name;

	private char grade;

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		if (mark < 0 || mark > 100) {
//			RuntimeException e = new RuntimeException(
//					"Invalid Mark : " + mark + " .Mark should be in  between 0 and 100");
			
			InvalidMarkException e = new InvalidMarkException("Invalid Mark : " + mark + " .Mark should be in  between 0 and 100") ;
			throw e;
		}
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		if (name == null || name.length() == 0) {
			//Exception e = new Exception("Name cannot be null or should have 1 character");
			
			InvalidNameException e = new InvalidNameException("Name cannot be null or should have 1 character");
			throw e;
		}
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) throws Exception {
		if (grade != 'A' & grade != 'B') {
			//Exception e = new Exception("Please enter correct grade A or B.The given grade is :" + grade);
			InvalidGradeException e =new InvalidGradeException("Please enter correct grade A or B.The given grade is :" + grade);
			throw e;
		}
		this.grade = grade;
	}

}
