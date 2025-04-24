package com.training.ui;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main07 {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add("Anju");
		set.add("Renju");
		set.add("Seema");
		set.add("Lia");
		set.add("Renju");
		set.add("Anu");

		for (String i : set) {
			System.out.println(i);
		}
		System.out.println("if set contains Anju: " + set.contains("Anju"));

		set.remove("Anju");
		System.out.println(set);

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String c = it.next();
			System.out.println(c.toUpperCase());
		}

		set.clear();
		System.out.println(set.isEmpty());
		System.out.println(set.size());
	}
}
