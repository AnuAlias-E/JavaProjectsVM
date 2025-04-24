package com.training.ui;

import java.util.LinkedList;
import java.util.List;

public class Main02 {
public static void main(String[] args) {
	List<Integer> list=new LinkedList<>();
	
	System.out.println(list);
	System.out.println(list.size());
	System.out.println(list.isEmpty());
	
	list.add(Integer.valueOf(200));
	list.add(Integer.valueOf(400));
	list.add(Integer.valueOf(100));
	list.add(Integer.valueOf(300));
	list.add(Integer.valueOf(500));
	list.add(1500);
	list.add(1700);
	
	System.out.println(list);
	System.out.println(list.size());
	System.out.println(list.isEmpty());
	
	System.out.println(list.indexOf(300));
	System.out.println(list.get(0));
	System.out.println(list.indexOf(400));
	System.out.println(list.indexOf(900));
	
	list.set(1,800);
	System.out.println(list);
	
	list.remove(1);
	System.out.println(list);
	list.remove(Integer.valueOf(1500));
	System.out.println(list);
	
	System.out.println(list.contains(1700));
	list.clear();
	
	
}
}
