package com.training.ui;

import java.util.Comparator;
import java.util.PriorityQueue;

import com.training.model.Person;

public class Main4 {
public static void main(String[] args) {
	PriorityQueue<Person> persons;
	persons = new PriorityQueue<>(Comparator.reverseOrder());
	
	persons.add(new Person(30, 170, 65));
	persons.add(new Person(26, 160, 62));
	persons.add(new Person(83, 180, 85));
	persons.add(new Person(27, 166, 55));
	persons.add(new Person(12, 122, 28));
	
	System.out.println(persons);
	Person person=	persons.poll();
	System.out.println(persons);
	
	 person=	persons.poll();
		System.out.println(persons);
		 person=	persons.poll();
			System.out.println(persons);
}
}
