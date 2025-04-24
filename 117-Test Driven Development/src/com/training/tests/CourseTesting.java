package com.training.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.model.Course;

public class CourseTesting {
	Course course;

	@BeforeEach
	public void init() {
		course = new Course();
	}

	@AfterEach
	public void clean() {
		course = null;
	}

//getCourseItemsCount
	
	@Test
	@DisplayName("Testing for Course Items Count")
	public void testCourseItemsCount() {
		course.setCourseCode("123");
		course.addCourseItem("Java", 40, 5000);
		course.addCourseItem("JQuery", 35, 3500);
		course.addCourseItem("CSS", 20, 2500);
		int expected = 3;
		int actual = course.getCourseItemsCount();
		assertEquals(expected, actual);
	}
	
	// getCourseTotalDuration
	
	@Test
	@DisplayName("Testing for Course Total Duration")
	public void testCourseTotalDuration() {
		course.setCourseCode("123");
		course.addCourseItem("Java", 40, 5000);
		course.addCourseItem("JQuery", 35, 3500);
		course.addCourseItem("CSS", 20, 2500);
		int expected = 95;
		int actual = course.getCourseTotalDuration();
		assertEquals(expected, actual);
	}
	
	// getCourseTotalFees
	
	@Test
	@DisplayName("Testing for Course Total Fees")
	public void testCourseTotalFees() {
		course.setCourseCode("123");
		course.addCourseItem("Java", 40, 5000);
		course.addCourseItem("JQuery", 35, 3500);
		course.addCourseItem("CSS", 20, 2500);
		double expected = 11000.0;
		double actual = course.getCourseTotalFees();
		assertEquals(expected, actual);
	}
	
}
