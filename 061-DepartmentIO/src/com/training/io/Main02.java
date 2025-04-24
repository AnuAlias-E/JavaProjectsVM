package com.training.io;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

import com.training.model.Department;

public class Main02 {
	public static void main(String[] args) {

		try {

			InputStream is = new FileInputStream("department.dat");
			ObjectInputStream ois = new ObjectInputStream(is);
			Department department = (Department) ois.readObject();
			System.out.println(department);
			department.printReport();
			ois.close();
			is.close();

		} catch (Throwable e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			System.exit(0);
		}

	}
}
