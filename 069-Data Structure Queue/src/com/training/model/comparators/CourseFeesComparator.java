package com.training.model.comparators;

import java.util.Comparator;

import com.training.model.Course;

public class CourseFeesComparator implements Comparator<Course> {

	@Override
	public int compare(Course o1, Course o2) {
		//if (o1.getFees() < o2.getFees())
			return -1;
		//if (o1.getFees() > o2.getFees())
			//return 1;

		//return 0;
	}

}
