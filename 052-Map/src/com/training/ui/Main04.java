package com.training.ui;

import java.util.Map;
import java.util.TreeMap;

import com.training.model.Circle;

public class Main04 {
public static void main(String[] args) {

	
	Map<Circle,String>map=new TreeMap<>();
	
	//Map<Circle,String>map=new HashMap<>();
	
	Circle c1=new Circle(100);
	Circle c2=new Circle(50);
	Circle c3=new Circle(5);
	
	
	map.put(c3,"Smallest");
	map.put(c2,"Medium");
	map.put(c1,"Largest");

	for(Map.Entry<Circle,String> entry:map.entrySet()) {
		System.out.println(entry.getKey()+"-"+entry.getValue());
	}
}
}
