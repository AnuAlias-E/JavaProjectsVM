package com.training.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main06 {
	public static void main(String[] args) {

		List<Integer> iList = new ArrayList<>();
		iList.add(10);
		iList.add(20);
		iList.add(30);
		Iterator<Integer> it = iList.iterator();// Fail Fast Iterator
		while (it.hasNext()) {
			Integer n = it.next();
			System.out.println(n);
			iList.remove(Integer.valueOf(20));
		}
		System.out.println(iList);

	}
}
