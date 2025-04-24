package com.training.model;

public class Course implements Comparable<Course> {
	private String courseName;
	private int durationInMonths;
	private double fees;

	public Course() {
		super();
	}

	public Course(String courseName, int durationInMonths, double fees) {
		super();
		this.courseName = courseName;
		this.durationInMonths = durationInMonths;
		this.fees = fees;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDurationInMonths() {
		return durationInMonths;
	}

	public void setDurationInMonths(int durationInMonths) {
		this.durationInMonths = durationInMonths;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", durationInMonths=" + durationInMonths + ", fees=" + fees + "]";
	}

	@Override
	public int compareTo(Course o) {
		return this.durationInMonths-o.durationInMonths;
	}

}
