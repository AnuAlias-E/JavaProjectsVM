package com.training.task;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileLetterCountingTask implements Runnable {
	private String fileName;

	public FileLetterCountingTask(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void run() {

		int count = 0;
		String name = Thread.currentThread().getName();
		try {
			System.out.println(fileName);
			InputStream is = new FileInputStream(fileName);
			while (true) {
				int i = is.read();
				if (i == -1) {
					break;
				} else {
					count++;
				}
				System.out.println(name + " : " + fileName + ": counting " + count);
				Thread.sleep(1000);
			}
			System.out.println(name + " thread : " + fileName + ": Counted ... count is : " + count);
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
