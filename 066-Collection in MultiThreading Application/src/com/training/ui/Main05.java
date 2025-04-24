package com.training.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main05 {
	public static void main(String[] args) {
		List<Integer> iList = new ArrayList<>();
		iList.add(10);
		iList.add(20);
		iList.add(30);
		Iterator<Integer> it = iList.iterator();
		while (it.hasNext()) {
			Integer n = it.next();
			System.out.println(n);
			if (n == 20)
				it.remove();
		}
		System.out.println(iList);
	}
}
