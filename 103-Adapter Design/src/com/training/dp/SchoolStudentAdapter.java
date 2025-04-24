package com.training.dp;

public class SchoolStudentAdapter implements Student {

	SchoolStudent ss;

	public SchoolStudentAdapter(SchoolStudent ss) {
		super();
		this.ss = ss;
	}

	@Override
	public String getName() {
		return ss.getStudentName();
	}

	@Override
	public String getSurName() {
		return ss.getStudentSurName();
	}

	@Override
	public String getEmail() {
		return ss.getStudentEmail();
	}

	@Override
	public String toString() {
		return "\nSchoolStudentAdapter [ss=" + ss + "]";
	}

}
