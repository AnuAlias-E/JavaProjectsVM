package com.training.model;

public class CourseItem {
	String courseItemName;
	int duration;
	double fees;

	public CourseItem(String courseItemName, int duration, double fees) {
		super();
		this.courseItemName = courseItemName;
		this.duration = duration;
		this.fees = fees;
	}

	public String getCourseItemName() {
		return courseItemName;
	}

	public void setCourseItemName(String courseItemName) {
		this.courseItemName = courseItemName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

}
