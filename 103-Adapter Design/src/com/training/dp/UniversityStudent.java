package com.training.dp;

public class UniversityStudent {
	String getStudentName;
	String getStudentSurName;
	String getStudentEmail;

	public UniversityStudent() {
		super();
	}

	public UniversityStudent(String getStudentName, String getStudentSurName, String getStudentEmail) {
		super();
		this.getStudentName = getStudentName;
		this.getStudentSurName = getStudentSurName;
		this.getStudentEmail = getStudentEmail;
	}

	public String getGetStudentName() {
		return getStudentName;
	}

	public void setGetStudentName(String getStudentName) {
		this.getStudentName = getStudentName;
	}

	public String getGetStudentSurName() {
		return getStudentSurName;
	}

	public void setGetStudentSurName(String getStudentSurName) {
		this.getStudentSurName = getStudentSurName;
	}

	public String getGetStudentEmail() {
		return getStudentEmail;
	}

	public void setGetStudentEmail(String getStudentEmail) {
		this.getStudentEmail = getStudentEmail;
	}

	@Override
	public String toString() {
		return "\nUniversityStudent [getStudentName=" + getStudentName + ", getStudentSurName=" + getStudentSurName
				+ ", getStudentEmail=" + getStudentEmail + "]";
	}

}
