package com.training.ui;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.training.model.Circle;

public class Main02 {
public static void main(String[] args) {

	
	Map<String,Circle>map=new HashMap<>();
	
	Circle c1=new Circle(100);
	Circle c2=new Circle(50);
	Circle c3=new Circle(1);
	
	map.put("BIG", c1);
	map.put("MEDIUM", c2);
	map.put("SMALL", c3);
	
	System.out.println(map);
	
	Set<String> allKeys=map.keySet();
	System.out.println(allKeys);
	
	Collection<Circle>allValues=map.values();
	System.out.println(allValues);
	

	for(Map.Entry<String,Circle> entry:map.entrySet()) {
		System.out.println(entry.getKey()+"-"+entry.getValue());
	}
	
	

	
}
}
