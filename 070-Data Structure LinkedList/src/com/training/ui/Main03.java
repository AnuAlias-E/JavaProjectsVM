package com.training.ui;

import com.training.ds.LinkedList;
import com.training.ds.SimpleListImpl;

public class Main03 {
	public static void main(String[] args) {

		LinkedList<Integer> iList = null;
		iList = new SimpleListImpl<>();

		try {
			iList.insert(Integer.valueOf(10));
			iList.insert(Integer.valueOf(20));
			iList.insert(Integer.valueOf(30));
			iList.insert(Integer.valueOf(40));
			iList.insert(Integer.valueOf(50));
			iList.insert(Integer.valueOf(60));

			iList.insert(3, Integer.valueOf(1000));

			Integer r = iList.get(4);
			System.out.println("Data in Position 4 is : " + r);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		iList.display();
	}
}
