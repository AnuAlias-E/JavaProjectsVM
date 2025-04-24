package com.training.model;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Course {
	private String courseName;
	private Set<CourseItem> courseItems;

	public Course() {
		super();
	}

	public Course(String courseName) {
		super();
		this.courseName = courseName;
		this.courseItems = new HashSet<>();
	}

	public void addCourseItem(String subjectName, int duration, double fees) {
		CourseItem courseItem = new CourseItem(subjectName, duration, fees);
		this.courseItems.add(courseItem);

	}

	public void printCourseDetails() {

		System.out.println("Course Name : " + this.courseName);
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");
		System.out.println("Sl No\t\tSubject Name\t\tDuration\t\tFees");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");
		int slNo = 1;
		double total = 0.00;

		for (CourseItem courseItem : courseItems) {

			System.out.println(slNo + "\t\t" + courseItem.getSubjectName() + "\t\t\t" + courseItem.getDurationInHours()
					+ "\t\t\t" + courseItem.getFees());

			total += courseItem.getFees();
			slNo++;
		}
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");

		System.out.println("TOTAL Fees : " + total);
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

	public void setCourseItems(Set<CourseItem> courseItems) {
		this.courseItems = courseItems;
	}
	
	public  CourseItem getLongestDurationCourseItem() {
		Optional<CourseItem> optionalResult;
		optionalResult=this.courseItems
					.stream()
					.max((ci1,ci2)->ci1.getDurationInHours()-ci2.getDurationInHours());
		if(!optionalResult.isPresent()) {
			return null;
		}
		else
		{
			return optionalResult.get();
		}
	}

	
	public  CourseItem getShortestDurationCourseItem() {
		Optional<CourseItem> optionalResult;
		optionalResult=this.courseItems
					.stream()
					.min((ci1,ci2)->ci1.getDurationInHours()-ci2.getDurationInHours());
		if(!optionalResult.isPresent()) {
			return null;
		}
		else
		{
			return optionalResult.get();
		}
	}
	
	
	public CourseItem getHighestPricedCourseItem() {
		Optional<CourseItem>optionalResult;
		optionalResult = this.courseItems.stream()
				.max((ci1, ci2) -> {
					if (ci1.getFees() < ci2.getFees())
						return -1;
					if (ci1.getFees() > ci2.getFees())
						return 1;
					return 0;
				});
		
		if(!optionalResult.isPresent()) {
			return null;
		}
		else
		{
			return optionalResult.get();
		}
	}
	
	public CourseItem getLowestPricedCourseItem() {
		Optional<CourseItem>optionalResult;
		optionalResult = this.courseItems.stream()
				.min((ci1, ci2) -> {
					if (ci1.getFees() < ci2.getFees())
						return -1;
					if (ci1.getFees() > ci2.getFees())
						return 1;
					return 0;
				});
		
		if(!optionalResult.isPresent()) {
			return null;
		}
		else
		{
			return optionalResult.get();
		}
	}
}
