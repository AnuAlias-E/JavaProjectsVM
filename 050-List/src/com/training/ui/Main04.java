package com.training.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main04 {
	public static void main(String[] args) {

		List<String> cities = new ArrayList<>();

		System.out.println(cities.size());
		System.out.println(cities.isEmpty());

		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Kolkata");
		cities.add("Pune");
		System.out.println(cities);
		System.out.println(cities.size());
		System.out.println(cities.isEmpty());

		for (int i = 0; i < cities.size(); i++) {
			String city = cities.get(i);
			System.out.println(city+":" + city.toUpperCase());
		}
		System.out.println("-----------------------------");
		for (String city : cities) {
			System.out.println(city+","+city.toLowerCase());
		}
		System.out.println("-----------------------------");

		Iterator<String>it=cities.iterator();
		while(it.hasNext()) {
			String city=it.next();
			System.out.println(city+","+city.length());
		}
		
	}
}
