package com.training.ui;

import com.training.task.OddNumberPrintingTask;
import com.training.workers.CityNamePrintingThread;
import com.training.workers.SumFindingThread;

public class Main01 {
public static void main(String[] args) throws InterruptedException {
	Thread t1= new CityNamePrintingThread();//new state or born state
	t1.setName("CNPT");
	t1.start();//Runnable state
	
	Runnable r1= new OddNumberPrintingTask(30, 50);
	Thread t2= new Thread(r1, "ONPT");
	t2.start();
	
	
	Thread t3 = new SumFindingThread("Sum Finder", 1, 10);
	t3.start();
	
	t1.join();
	t2.join();
	t3.join();
	for(int i=1;i<=5;i++) {
		System.out.println(Thread.currentThread().getName()+" : "+i);//Running Thread is Main Thread
	}
	System.out.println(t1.isAlive());			
	System.out.println(t2.isAlive());
	System.out.println(t3.isAlive());
}
}
