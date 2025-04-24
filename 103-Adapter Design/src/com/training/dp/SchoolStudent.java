package com.training.dp;

public class SchoolStudent {
	String studentName;
	String studentSurName;
	String studentEmail;
	Student student;

	public SchoolStudent() {
		super();
	}

	public SchoolStudent(String studentName, String studentSurName, String studentEmail) {
		super();
		this.studentName = studentName;
		this.studentSurName = studentSurName;
		this.studentEmail = studentEmail;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSurName() {
		return studentSurName;
	}

	public void setStudentSurName(String studentSurName) {
		this.studentSurName = studentSurName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	@Override
	public String toString() {
		return "\nSchoolStudent [studentName=" + studentName + ", studentSurName=" + studentSurName + ", studentEmail="
				+ studentEmail + "]";
	}

}
