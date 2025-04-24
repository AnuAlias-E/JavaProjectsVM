package com.training.model;

import java.util.LinkedList;
import java.util.List;

public class CommonData {
	public static List<Movie> movies = new LinkedList<>();

	public static List<Person> persons = new LinkedList<>();

	public static List<Booking>bookings= new LinkedList<>();
	public static void init() {
		Movie movie1 = new Movie(101, "Marco");
		Movie movie2 = new Movie(102, "Harry Potter");
		Movie movie3 = new Movie(103, "Empuran");
		Movie movie4 = new Movie(104, "Lucifer");
		Movie movie5 = new Movie(105, "Gilli");

		Person person1 = new Person(1, "Renju", "Female", 33);
		Person person2 = new Person(2, "Ram", "Male", 55);
		Person person3 = new Person(3, "Milan", "Male", 28);
		Person person4 = new Person(4, "Aarthy", "Female", 58);
		Person person5 = new Person(5, "Prabha", "Female", 25);

		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
		movies.add(movie4);
		movies.add(movie5);

		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		persons.add(person5);
	}
}
