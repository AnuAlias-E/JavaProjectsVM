package com.training.ui;

import java.util.Arrays;
import java.util.Comparator;

import com.training.model.Person;
import com.training.model.comparators.EmployeeBasicSalaryDescendingComparator;
import com.training.model.comparators.PersonNameComparator;

public class Main14 {
	public static void main(String[] args) {
		Person[] persons = { new Person("Anu", 40), new Person("Renju", 33), new Person("Manoj", 18),
				new Person("Rahul", 21) };

		System.out.println("Person Details");
		System.out.println("Before Sort" + Arrays.toString(persons));

		System.out.println("-------------------------------------");
		Arrays.sort(persons, new PersonNameComparator());
		System.out.println("Person Details after sort");
		System.out.println("Before Sort" + Arrays.toString(persons));
		System.out.println("-------------------------------------");
		Person searchObject = new Person("Deepa", 40);
		int nameSearchResult = nameComparatorSearch(persons, searchObject);
		if (nameSearchResult == -1)
			System.out.println("Search person with name " + searchObject.getName()
					+ " is not found and the searchResult is " + nameSearchResult);
		else
			System.out.println("Search person with name" + searchObject.getName() + " is present at position : "
					+ nameSearchResult);
		System.out.println("---------------------------");

		searchObject = new Person("Renju", 40);
		nameSearchResult = nameComparatorSearch(persons, searchObject);
		if (nameSearchResult == -1)
			System.out.println("Search person with name " + searchObject.getName()
					+ " is not found and the searchResult is " + nameSearchResult);
		else
			System.out.println("Search person with name " + searchObject.getName() + " is present at position : "
					+ nameSearchResult);
		System.out.println("---------------------------");
	}

	private static int nameComparatorSearch(Person[] persons, Person searchObject) {

		Comparator nameComparator = new PersonNameComparator();
		int low = 0, high = persons.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int r = nameComparator.compare(persons[mid], searchObject);
			if (r == 0)
				return mid;

			if (r < 0)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;

	}
}
