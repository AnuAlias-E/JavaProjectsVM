package com.training.ui;

import com.training.ds.StringStack;

public class Main4 {
public static void main(String[] args) {
	
	StringStack stack1=new StringStack(10);

	
	stack1.push("Delhi");
	stack1.push("Mumbai");
	stack1.push("Pune");
	stack1.push("Kochi");
	stack1.push("TVM");
	stack1.push("Bangalore");
	System.out.println(stack1);
	
	String r =stack1.pop();
	System.out.println("Removed element: "+r);
	System.out.println(stack1);
	
	 r =stack1.pop();
	System.out.println("Removed element : "+r);
	System.out.println(stack1);
	
	
	 r =stack1.pop();
	System.out.println("Removed element : "+r);
	System.out.println(stack1);
	
}
}
