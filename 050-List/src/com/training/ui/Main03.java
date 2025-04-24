package com.training.ui;

import java.util.ArrayList;
import java.util.List;

/**
 * prices.add(500.0f);
 * 
 */
public class Main03 {
	public static void main(String[] args) {
		List<Float> prices = new ArrayList<>();

		System.out.println(prices.size());// Size of the list
		System.out.println(prices.isEmpty());// checking the list is empty

		prices.add(11.00f); // add the elements to the list
		prices.add(700.00f);
		prices.add(500.0f);
		prices.add(324.0f);
		prices.add(700.0f);
		prices.add(602.60f);
		prices.add(700.0f);
		prices.add(300.0f);

		System.out.println(prices);
		System.out.println(prices.size());
		System.out.println(prices.isEmpty());

		System.out.println(prices.contains(500.0f));// check the prices contains 500.0f

		System.out.println(prices.get(0));// first element
		System.out.println(prices.get(prices.size() - 1));// last element

		System.out.println(prices.indexOf(700.0f));// find out index of 700.0f
		System.out.println(prices.lastIndexOf(700.0f));// find out the last index of 700.0f

		prices.set(3, 400.0f);// replace the 3rd index with 400.0f
		System.out.println(prices);

		prices.remove(1); // remove the 1st index
		System.out.println(prices);
		prices.remove(Float.valueOf(300.0f));// remove the element 300.0f
		System.out.println(prices);

		prices.clear();// clear the prices
		System.out.println(prices);

		System.out.println(prices.size());
		System.out.println(prices.isEmpty());
	}
}
