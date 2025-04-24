package com.training.ui;

import java.util.Arrays;

import com.training.model.Person;
import com.training.model.comparators.PersonNameComparator;

public class Main14 {
	public static void main(String[] args) {

		Person[] persons = { new Person("Anu", 40), new Person("Renju", 33), new Person("Manoj", 18),
				new Person("Rahul", 21) };
		PersonNameComparator nameComparator = new PersonNameComparator();
		for (int i = 0; i < persons.length; i++) {

			for (int j = 0; j < persons.length - i - 1; j++) {
				
				int r = nameComparator.compare(persons[j], persons[j + 1]);
				if (r > 0) {// when the current item is greater than next
					Person temp;
					temp = persons[j];
					persons[j] = persons[j + 1];
					persons[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(persons));
		persons = null;
	}
}
