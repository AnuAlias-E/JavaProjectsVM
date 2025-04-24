package com.training.ui;

import com.training.ds.DoubleStack;

public class Main3 {
public static void main(String[] args) {
	DoubleStack stack1=new DoubleStack(10);
	
	byte v1=30;
	short v2=40;
	int v3=80;
	long v4=90;
	char v5='A';
	float v6=78.0f;
	double v7=800.05;
	
	stack1.push(v1);
	stack1.push(v2);
	stack1.push(v3);
	stack1.push(v4);
	stack1.push(v5);
	stack1.push(v6);
	stack1.push(v7);
	System.out.println(stack1);
	
	double r =stack1.pop();
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
