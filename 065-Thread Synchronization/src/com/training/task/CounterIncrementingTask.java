package com.training.task;

public class CounterIncrementingTask implements Runnable{
Counter counter ;

	public CounterIncrementingTask(Counter counter) {
	super();
	this.counter = counter;
}

	@Override
	public void run() {
	counter.increment();
		
	}
 
}
