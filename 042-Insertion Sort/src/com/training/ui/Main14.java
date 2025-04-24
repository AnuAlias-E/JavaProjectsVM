package com.training.ui;

import java.util.Arrays;

import com.training.model.Person;
import com.training.model.comparators.PersonNameComparator;

public class Main14 {
	public static void main(String[] args) {
		Person[] persons = { new Person("Anu", 40), new Person("Renju", 33), new Person("Manoj", 18),
				new Person("Rahul", 21) };
		
		System.out.println("Before Sort" + Arrays.toString(persons));

		int n = persons.length;
		PersonNameComparator nameComparator = new PersonNameComparator();
		for (int i = 1; i < n; i++) {
			Person key = persons[i];
			int j = i - 1;
			int r=nameComparator.compare(persons[j], key);
			while (j >= 0 && r > 0) {
				persons[j + 1] = persons[j];
				j = j - 1;
				if(j>=0)
					r=nameComparator.compare(persons[j], key);
			}
			persons[j + 1] = key;

		}
		System.out.println("After Sort" + Arrays.toString(persons));
		persons=null;
	}

}
