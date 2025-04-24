package com.training.dp;

public class UniversityStudentAdapter implements Student {
	UniversityStudent us;

	public UniversityStudentAdapter(UniversityStudent us) {
		super();
		this.us = us;
	}

	@Override
	public String toString() {
		return "\nUniversityStudentAdapter [us=" + us + "]";
	}

	@Override
	public String getName() {

		return us.getGetStudentName();
	}

	@Override
	public String getSurName() {
		return us.getGetStudentSurName();
	}

	@Override
	public String getEmail() {
		return us.getGetStudentEmail();
	}

}
