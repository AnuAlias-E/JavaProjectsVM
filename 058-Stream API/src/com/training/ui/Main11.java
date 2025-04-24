package com.training.ui;

import java.util.LinkedList;
import java.util.List;

public class Main11 {
	public static void main(String[] args) {
		List<Integer> iList = new LinkedList<>();
		iList.add(Integer.valueOf(200));
		iList.add(Integer.valueOf(10));
		iList.add(Integer.valueOf(150));
		iList.add(Integer.valueOf(70));
		iList.add(Integer.valueOf(8));
		iList.add(Integer.valueOf(140));
		iList.add(Integer.valueOf(200));
		iList.add(Integer.valueOf(750));
		iList.add(Integer.valueOf(200));
		iList.add(Integer.valueOf(330));
		iList.add(Integer.valueOf(450));

		boolean result1 = iList.stream()
								.anyMatch(i -> i >= 1000);
		System.out.println(result1);
		
		boolean result2 = iList.stream()
				.allMatch(i -> i >= 5);
			System.out.println(result2);
			
		boolean result3 = iList.stream()
					.noneMatch(i -> i == 0);
				System.out.println(result3);

	}
}
