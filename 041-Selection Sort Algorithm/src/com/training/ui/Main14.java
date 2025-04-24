package com.training.ui;

import java.util.Arrays;

import com.training.model.Person;
import com.training.model.comparators.PersonNameComparator;

public class Main14 {
public static void main(String[] args) {
	Person[] persons = { new Person("Anu", 40), new Person("Renju", 33), new Person("Manoj", 18),
			new Person("Rahul", 21) };
	
	System.out.println("Before Sort" + Arrays.toString(persons));
	PersonNameComparator nameComparator = new PersonNameComparator();

	int n = persons.length;

	int imin;
	for (int i = 0; i < n - 1; i++) {
		imin = i;
		for (int j = i + 1; j < n; j++) {
			int r = nameComparator.compare(persons[j], persons[imin]);
			if (r < 0) {
				imin = j;
			}
		}
		Person temp;
		temp = persons[i];
		persons[i] = persons[imin];
		persons[imin] = temp;

	}

	System.out.println("After Sort: " + Arrays.toString(persons));
	persons = null;
}
}
