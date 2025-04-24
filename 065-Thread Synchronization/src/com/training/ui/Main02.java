package com.training.ui;

import com.training.task.CapitalLetterCountingTask;

public class Main02 {
public static void main(String[] args) {
	Runnable task;
	 task= new CapitalLetterCountingTask();
	
	Thread t1= new Thread(task, "T1");
	t1.start();
	
	Thread t2= new Thread(task, "T2");
	t2.start();
}
}
