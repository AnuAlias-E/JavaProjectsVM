package com.training.ui;

import java.util.Set;
import java.util.TreeSet;

public class Main06 {
public static void main(String[] args) {
	Set<Integer> set = new TreeSet<>();
	set.add(Integer.valueOf(200));
	set.add(Integer.valueOf(10));
	set.add(Integer.valueOf(30));
	set.add(Integer.valueOf(400));
	set.add(Integer.valueOf(300));
	set.add(Integer.valueOf(300));
	
	System.out.println(set);
	System.out.println(set.contains(Integer.valueOf(300)));
}
}
