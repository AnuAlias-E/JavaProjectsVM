package com.training.ui;

import java.util.Arrays;
import java.util.Comparator;

import com.training.model.Employee;
import com.training.model.Person;
import com.training.model.SalesEmployee;
import com.training.model.comparators.EmployeeBasicSalaryAscendingCompartor;
import com.training.model.comparators.PersonNameComparator;

public class Main9 {

	public static void main(String[] args) {
		
		Person[] persons = { new Person("Anu", 40), new Person("Renju", 33), new Person("Manoj", 18),
				new Person("Rahul", 21) };
		
		System.out.println("Person Details");		
		System.out.println("Before Sort" + Arrays.toString(persons));
		
		System.out.println("-------------------------------------");
		
		System.out.println("-----------Using Equals Search----------------");
		Person searchObject = new Person("Anu", 40);
		int searchResult = search(persons, searchObject);
		if (searchResult == -1)
			System.out.println("Search Person with name " + searchObject.getName()
					+ " is not found and the searchResult is " + searchResult);
		else
			System.out.println("Search  Person with name  " + searchObject.getName() + " is present at position : "
					+ searchResult);
		System.out.println("---------------------------");
		

		System.out.println("--------------AGE Comaparable Search-------------");
		searchObject = new Person("Anu", 18);
		int ageSearchResult = ageSearch(persons, searchObject);
		if (ageSearchResult == -1)
			System.out.println("Search Person with age " + searchObject.getAge()
					+ " is not found and the searchResult is " + ageSearchResult);
		else
			System.out.println("Search Person  with age  " + searchObject.getAge() + " is present at position : "
					+ ageSearchResult);
		System.out.println("---------------------------");
		

		System.out.println("-----------Comparator Search---------------");
		searchObject = new Person("Deepa", 40);
		int nameSearchResult = nameComparatorSearch(persons, searchObject);
		if (nameSearchResult == -1)
			System.out.println("Search person with name " + searchObject.getName()
					+ " is not found and the searchResult is " + nameSearchResult);
		else
			System.out.println("Search person with name" + searchObject.getName() + " is present at position : "
					+ nameSearchResult);
		System.out.println("---------------------------");
	}

	private static int nameComparatorSearch(Person[] persons, Person searchObject) {
		Comparator nameComparator = new PersonNameComparator();
		for (int i = 0; i < persons.length; i++) {

			int r = nameComparator.compare(persons[i], searchObject);
			if (r == 0)
				return i;

		}
		return -1;
	}

	private static int ageSearch(Person[] persons, Person searchObject) {
		for (int i = 0; i < persons.length; i++) {
			if (searchObject instanceof Comparable) {
				Comparable searchData = (Comparable) searchObject;
				int r = persons[i].compareTo(searchObject);
				if (r == 0)
					return i;
			}
		}
		return -1;
	}

	private static int search(Person[] persons, Person searchObject) {
		for (int i = 0; i < persons.length; i++) {
			if (persons[i].equals(searchObject))
				return i;
		}
		return -1;
	}

}
