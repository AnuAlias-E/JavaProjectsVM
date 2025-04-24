package com.training.model;

import java.util.Arrays;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "candidates")
public class Candidate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@Column
	String name;

	@Column
	String city;

	@ElementCollection
	@CollectionTable(name = "candidate_marks")
	@OrderColumn(name = "idx")
	double[] marks;

	public Candidate() {
		super();
	}

	public Candidate(String name, String city, double[] marks) {
		super();
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double[] getMarks() {
		return marks;
	}

	public void setMarks(double[] marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "\nCandidate [id=" + id + ", name=" + name + ", city=" + city + ", marks=" + Arrays.toString(marks)
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Candidate))
			return false;
		Candidate other = (Candidate) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
