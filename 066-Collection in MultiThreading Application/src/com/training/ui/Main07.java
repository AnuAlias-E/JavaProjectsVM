package com.training.ui;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main07 {
	public static void main(String[] args) {
		List<Integer> iList = new CopyOnWriteArrayList<>();
		iList.add(10);
		iList.add(20);
		iList.add(30);
		Iterator<Integer> it = iList.iterator();// Fail safe iterator
		while (it.hasNext()) {
			Integer n = it.next();
			System.out.println(n);
			if (n == 20)
				iList.add(Integer.valueOf(1000));
		}
		System.out.println(iList);
		it = iList.iterator();
		while (it.hasNext()) {
			Integer n = it.next();
			System.out.println(n);
		}

	}
}
