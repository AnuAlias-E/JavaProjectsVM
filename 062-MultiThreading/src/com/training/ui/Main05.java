package com.training.ui;

import com.training.task.FileLetterCountingTask;

public class Main05 {
	public static void main(String[] args) {
		Thread t = new Thread(new FileLetterCountingTask("hello.txt"), "CT");
		t.start();

		Thread t1 = new Thread(new FileLetterCountingTask("welcome.txt"), "CT1");
		t1.start();

		Thread t2 = new Thread(new FileLetterCountingTask("greet.txt"), "CT2");
		t2.start();

	}
}
