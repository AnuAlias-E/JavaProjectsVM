package com.training.ui;

import com.training.task.Counter;
import com.training.task.CounterIncrementingTask;
import com.training.task.CounterReadingTask;

public class Main04 {
public static void main(String[] args) {
	Counter counter = new Counter();
	Runnable runnable1 = new CounterReadingTask(counter);
	Thread t1 = new Thread(runnable1, "CRT");
	t1.start();
	
	Runnable runnable2 = new CounterIncrementingTask(counter);
	Thread t2 = new Thread(runnable2, "CIT");
	t2.start();
}
}
