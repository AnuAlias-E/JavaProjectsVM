package com.training.ui;

import java.util.Arrays;

import com.training.model.Person;

public class Main13 {
public static void main(String[] args) {
	Person[] persons = { new Person("Anu", 40), new Person("Renju", 33), new Person("Manoj", 18),
			new Person("Rahul", 21) };
	
	System.out.println("Person Details");		
	System.out.println("Before Sort" + Arrays.toString(persons));
	
	System.out.println("-------------------------------------");
	Arrays.sort(persons);
	System.out.println("Person Details after sort");		
	System.out.println("Before Sort" + Arrays.toString(persons));
	System.out.println("-------------------------------------");
	Person searchObject = new Person("Anu", 18);
	int ageSearchResult = ageSearch(persons, searchObject);
	if (ageSearchResult == -1)
		System.out.println("Search Person with age " + searchObject.getAge()
				+ " is not found and the searchResult is " + ageSearchResult);
	else
		System.out.println("Search Person  with age  " + searchObject.getAge() + " is present at position : "
				+ ageSearchResult);
	System.out.println("---------------------------");
	
	 searchObject = new Person("Anu", 55);
	 ageSearchResult = ageSearch(persons, searchObject);
	if (ageSearchResult == -1)
		System.out.println("Search Person with age " + searchObject.getAge()
				+ " is not found and the searchResult is " + ageSearchResult);
	else
		System.out.println("Search Person  with age  " + searchObject.getAge() + " is present at position : "
				+ ageSearchResult);
	System.out.println("---------------------------");
	
}

private static int ageSearch(Person[] persons, Person searchObject) {

	int low = 0, high = persons.length - 1;
	while (low <= high) {
		int mid = low + (high - low) / 2;
		int r = persons[mid].compareTo(searchObject);
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
