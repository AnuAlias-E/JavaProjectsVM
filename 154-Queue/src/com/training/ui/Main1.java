package com.training.ui;

import java.util.LinkedList;
import java.util.Queue;

public class Main1 {
	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<>();
		queue.add(20);
		queue.add(15);
		queue.add(17);
		queue.add(12);
		queue.add(16);
		
		Integer result=queue.poll();
		System.out.println(result);
		
		 result=queue.poll();
		System.out.println(result);
		
		 result=queue.poll();
		System.out.println(result);
		
		System.out.println(queue);
		
		Integer temp=queue.peek();//Only just take first element to remove from queue
		System.out.println(temp);
		
		System.out.println(queue);
		
		 result=queue.poll();//remove the element from the queue
			System.out.println(result);
			
			System.out.println(queue);
	}

}
