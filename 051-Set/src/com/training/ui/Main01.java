package com.training.ui;

import java.util.HashSet;
import java.util.Set;

public class Main01 {
public static void main(String[] args) {
	Set<Integer> set = new HashSet<>();
	set.add(Integer.valueOf(200));
	set.add(Integer.valueOf(10));
	set.add(Integer.valueOf(30));
	set.add(Integer.valueOf(400));
	set.add(Integer.valueOf(300));
	set.add(Integer.valueOf(300));
	
	System.out.println(set);
	System.out.println(set.contains(Integer.valueOf(300)));
	
	set.remove(Integer.valueOf(300));
	System.out.println(set);
	System.out.println(set.size());
	set.clear();
	System.out.println(set);
	System.out.println(set.size());
}
}
