package com.training.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctors")

@NamedQueries({ @NamedQuery(name = "findAll", query = "select d from Doctor d"),
		@NamedQuery(name = "findById", query = "select d from Doctor d where d.id= :searchId"),
		@NamedQuery(name = "updateFees", query = "update Doctor set fees=fees+200"),
		@NamedQuery(name = "deleteBasedOnFees", query = "delete  from Doctor d where d.fees < :feesCutOff"), })
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@Column
	String name;

	@Column
	double fees;

	@Column
	String gender;

	@Column
	LocalDate practiceStartDate;

	public Doctor() {
		super();
	}

	public Doctor(String name, double fees, String gender, LocalDate practiceStartDate) {
		super();
		this.name = name;
		this.fees = fees;
		this.gender = gender;
		this.practiceStartDate = practiceStartDate;
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

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getPracticeStartDate() {
		return practiceStartDate;
	}

	public void setPracticeStartDate(LocalDate practiceStartDate) {
		this.practiceStartDate = practiceStartDate;
	}

	@Override
	public String toString() {
		return "\nDoctor [id=" + id + ", name=" + name + ", fees=" + fees + ", gender=" + gender
				+ ", practiceStartDate=" + practiceStartDate + "]";
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
		if (!(obj instanceof Doctor))
			return false;
		Doctor other = (Doctor) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
