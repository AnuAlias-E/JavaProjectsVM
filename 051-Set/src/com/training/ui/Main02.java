package com.training.ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main02 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(Integer.valueOf(200));
		set.add(Integer.valueOf(10));
		set.add(Integer.valueOf(30));
		set.add(Integer.valueOf(400));
		set.add(Integer.valueOf(300));
		set.add(Integer.valueOf(300));

		for (Integer i : set) {
			System.out.println(i);
		}
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer c = it.next();
			System.out.println(c);
		}
	}
}
