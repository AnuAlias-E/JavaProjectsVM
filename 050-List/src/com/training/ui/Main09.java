package com.training.ui;

import java.util.ArrayList;
import java.util.List;

import com.training.model.Person;

public class Main09 {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();

		persons.add(new Person("Anu", 40));
		persons.add(new Person("Renju", 33));
		persons.add(new Person("Manoj", 18));
		persons.add(new Person("Arjun", 21));
		persons.add(new Person("Kiran", 45));
		System.out.println("*********************************************************************");
		System.out.println("SlNo\tName\tAge");
		System.out.println("*********************************************************************");
		int slNo = 1;
		Person youngestPerson = persons.get(0);
		Person eldestPerson = persons.get(0);
		for (Person person : persons) {

			System.out.println(slNo++ + "\t" + person.getName() + "\t" + person.getAge());
			int r = person.compareTo(youngestPerson);
			if (r < 0)
				youngestPerson = person;
			r = person.compareTo(eldestPerson);
			if (r > 0)
				eldestPerson = person;
		}
		System.out.println("*********************************************************************");
		System.out.println("Youngest Person: " + youngestPerson.getName());
	
		System.out.println("Eldest Person: " + eldestPerson.getName());
		System.out.println("*********************************************************************");
	}
}
