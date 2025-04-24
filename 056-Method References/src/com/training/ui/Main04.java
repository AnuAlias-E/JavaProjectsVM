package com.training.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main04 {
public static void main(String[] args) {
	List<String> names = new ArrayList<>();
	names.add("Anu");
	names.add("Prabhu");
	names.add("Shruthi Menon");
	names.add("Karthik");
	names.add("Aarthi");
	
	Function<String , Integer>fn;
	fn=s->s.length();
	Integer r=fn.apply(names.get(0));
	System.out.println(r);

	//Method Reference of built-in function
	fn=String::length;
	r=fn.apply(names.get(0));
	System.out.println(r);
	
	r=fn.apply(names.get(1));
	System.out.println(r);
	
	r=fn.apply(names.get(4));
	System.out.println(r);
	
	Function<String, String>fn1;
	fn1=s->s.toUpperCase();	
	String upperStr=fn1.apply(names.get(0));
	System.out.println(upperStr);
	
	//Method Reference of built-in function
	fn1=String::toUpperCase;
	upperStr=fn1.apply(names.get(0));
	System.out.println(upperStr);
	
}
}
