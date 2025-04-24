package com.training.ui;

import java.util.ArrayList;
import java.util.List;

public class Main06 {
	public static void main(String[] args) {
		List<Float> prices = new ArrayList<>();

		prices.add(Float.valueOf(66.6f)); // add the elements to the list
		prices.add(Float.valueOf(21.5f));
		prices.add(Float.valueOf(19.2f));
		prices.add(Float.valueOf(22.8f));
		prices.add(Float.valueOf(70.6f));
		prices.add(90.0f);
		prices.add(199.00f);
		
		Float min = prices.get(0);
		Float max = prices.get(0);
		
		for (int i = 1; i < prices.size(); i++) {
			
			if (prices.get(i) < min) {
				min = prices.get(i);
			}
			
			if (prices.get(i) > max) {
				max = prices.get(i);
			}
		}
		
		System.out.println("Minimum Value: " + min);
		System.out.println("Maximum Value: " + max);
		
for (Float i : prices) {
			
			if (i.compareTo(min)<0) {
				min = i;
			}
			
			if (i.compareTo(min)>0) {
				max = i;
			}
		}
		
		System.out.println("Minimum Value: " + min);
		System.out.println("Maximum Value: " + max);
	}
}
