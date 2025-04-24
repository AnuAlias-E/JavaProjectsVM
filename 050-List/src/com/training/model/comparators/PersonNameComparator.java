package com.training.model.comparators;

import java.util.Comparator;

import com.training.model.Person;

public class PersonNameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		int r= o1.getName().compareTo(o2.getName());
		return r;
	}

}
