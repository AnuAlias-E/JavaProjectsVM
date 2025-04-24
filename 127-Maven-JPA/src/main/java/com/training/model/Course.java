package com.training.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int courseId;

	@Column
	String courseName;

	@Column
	double fees;

	@OneToMany(cascade = CascadeType.ALL)
	Set<Subject> subjects;

	public Course() {
		super();
		this.subjects = new HashSet<>();
	}

	public Course(String courseName, double fees) {
		super();
		this.courseName = courseName;
		this.fees = fees;
		this.subjects = new HashSet<>();
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public Set<Subject> getSubjects() {
		return subjects;
	}

	public void addSubject(Subject subject) {
		this.subjects.add(subject);
	}

	public void removeSubject(Subject subject) {
		this.subjects.remove(subject);
	}

	@Override
	public String toString() {
		return "\nCourse [courseId=" + courseId + ", courseName=" + courseName + ", fees=" + fees + ", subjects="
				+ subjects + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + courseId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Course))
			return false;
		Course other = (Course) obj;
		if (courseId != other.courseId)
			return false;
		return true;
	}

}
