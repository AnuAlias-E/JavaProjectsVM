package com.training.model;

import java.util.HashSet;
import java.util.Set;

public class Course {
	String courseCode;
	String courseName;
	Set<CourseItem> courseItems=new HashSet<>();

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Set<CourseItem> getCourseItems() {
		return courseItems;
	}

	public int getCourseItemsCount() {
		return courseItems.size();
	}

	public void addCourseItem(String courseItemName, int duration, double fees) {
		CourseItem courseItem = new CourseItem(courseItemName, duration, fees);
		this.courseItems.add(courseItem);
	}

	public int getCourseTotalDuration() {
		int totalDuration = courseItems.stream().mapToInt(n->n.getDuration()).sum();
		return totalDuration;
	}

	public double getCourseTotalFees() {
		double totalfees = courseItems.stream().mapToDouble(n->n.getFees()).sum();
		return totalfees;
	}
}
