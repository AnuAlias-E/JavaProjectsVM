package com.training.ui;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import com.training.model.Employee;
import com.training.model.Person;
import com.training.model.comparators.PersonNameComparator;

public class Main09 {
	public static void main(String[] args) {
		List<Person> allPersons = new LinkedList<>();
		allPersons.add(new Person("Ram", 24));
		allPersons.add(new Person("Dinesh", 44));
		allPersons.add(new Person("Reshmi", 28));
		allPersons.add(new Person("Mamta", 30));
		allPersons.add(new Person("Seetha", 36));
		allPersons.add(new Person("Raju", 50));
		allPersons.add(new Person("Rahul", 23));
		System.out.println("First Person by Name");
		Optional<Person> optionalResult1 = allPersons.stream().min(new PersonNameComparator());
		if (optionalResult1.isPresent()) {
			System.out.println(optionalResult1.get());
		} else {
			System.out.println("Collection is empty");
		}
		System.out.println("------------------------------------");
		System.out.println("First Person by Age");
		Optional<Person> optionalResult2 = allPersons.stream().min((p1, p2) -> p1.getAge() - p2.getAge());

		if (optionalResult2.isPresent()) {
			System.out.println(optionalResult2.get());
		} else {
			System.out.println("Collection is empty");
		}

		System.out.println("------------------------------------");
		System.out.println("Last Person by Name");
		Optional<Person> optionalResult3 = allPersons.stream().max(new PersonNameComparator());
		if (optionalResult1.isPresent()) {
			System.out.println(optionalResult3.get());
		} else {
			System.out.println("Collection is empty");
		}
		
		System.out.println("------------------------------------");
		System.out.println("Last Person by Age");
		Optional<Person> optionalResult4 = allPersons.stream().max((p1, p2) -> p1.getAge() - p2.getAge());

		if (optionalResult3.isPresent()) {
			System.out.println(optionalResult4.get());
		} else {
			System.out.println("Collection is empty");		}

	}
}
