package com.training.ui;

import com.training.ds.LongStack;

public class Main2 {
public static void main(String[] args) {
LongStack stack1=new LongStack(10);
	
	byte v1=30;
	short v2=40;
	int v3=80;
	long v4=90;
	char v5='A';
	
	stack1.push(v1);
	stack1.push(v2);
	stack1.push(v3);
	stack1.push(v4);
	stack1.push(v5);
	
	System.out.println(stack1);
	
	long r =stack1.pop();
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
