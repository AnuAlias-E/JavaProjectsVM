package com.training.model.comparators;

import java.util.Comparator;

import com.training.model.Course;

public class CourseNameComparator implements Comparator<Course>{

	@Override
	public int compare(Course o1, Course o2) {
		return o1.getCourseName().compareTo(o2.getCourseName());
	}

}
