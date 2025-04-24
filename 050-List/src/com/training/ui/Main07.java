package com.training.ui;

import java.util.ArrayList;
import java.util.List;

import com.training.model.Circle;

public class Main07 {
public static void main(String[] args) {
	List<Circle> circles = new ArrayList<>();
	Circle c1 = new Circle(10);
	
	circles.add(c1);
	circles.add(new Circle(20));
	circles.add(new Circle(40));
	circles.add(new Circle(50));
	circles.add(new Circle(87));
	
	System.out.println(circles);
	System.out.println(circles.contains(new Circle(55)));
	
	circles.set(1, new Circle(1000));
	
	
	circles.remove(new Circle(50));
	
	System.out.println(circles);
	
	Circle largest =circles.get(0);
	Circle smallest =circles.get(0);
	for(int i=1;i<circles.size();i++) {
		int r = circles.get(i).compareTo(smallest);
		if(r<0)
			smallest=circles.get(i);
		 r = circles.get(i).compareTo(largest);
		if(r>0)
			largest=circles.get(i);
	}
	
	System.out.println("Smallest Circle :"+smallest);
	System.out.println("Largest Circle :"+largest);
	
	for(Circle c : circles) {
		int r = c.compareTo(smallest);
		if(r<0)
			smallest=c;
		 r = c.compareTo(largest);
		if(r>0)
			largest=c;
	}
	System.out.println("Min Circle :"+smallest);
	System.out.println("Max Circle :"+largest);
	
}
}
