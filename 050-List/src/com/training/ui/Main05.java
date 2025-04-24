package com.training.ui;

import java.util.LinkedList;
import java.util.List;

public class Main05 {

public static void main(String[] args) {
	List<Integer> list=new LinkedList<>();
		
	list.add(Integer.valueOf(200));
	list.add(Integer.valueOf(400));
	list.add(Integer.valueOf(100));
	list.add(Integer.valueOf(300));
	list.add(Integer.valueOf(500));
	list.add(1500);
	list.add(1700);
	int sum=0;
	for(Integer i : list) {
		System.out.println(i);
		sum+=i;
	}
	
	System.out.println("sum is: "+sum);
}

}
