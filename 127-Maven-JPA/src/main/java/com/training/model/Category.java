package com.training.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String categoryName;

	@ElementCollection
	@CollectionTable(name = "category_technologies")
	private Set<String> technologyNames;

	public Category(String categoryName) {
		super();
		this.categoryName = categoryName;
		this.technologyNames = new HashSet<>();
	}

	public Category() {
		super();
		this.technologyNames = new HashSet<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void addTechnologyNames(String technology) {
		this.technologyNames.add(technology);
	}

	public void removeTechnologyNames(String technology) {
		this.technologyNames.remove(technology);
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "\nCategory [id=" + id + ", categoryName=" + categoryName + ", technologyNames=" + technologyNames + "]";
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
		if (!(obj instanceof Category))
			return false;
		Category other = (Category) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
