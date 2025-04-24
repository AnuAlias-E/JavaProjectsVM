package com.training.ui;

import com.training.model.pack1.Addition;
import com.training.model.pack1.Multiplication;
import com.training.model.pack1.Subtraction;
import com.training.model.pack1.Task;

public class Main01 {
	public static void main(String[] args) {

		Task task;
		//Lambda Expression
		task = (x, y) -> x + y;
		System.out.println(task.execute(10, 20));
		// Lambda Expression
		task = (x, y) -> x - y;
		System.out.println(task.execute(50, 10));

		// Method Reference for static methods
		task = Addition::add;
		System.out.println(task.execute(10, 20));
		// Method Reference for static methods
		task = Subtraction::subtract;
		System.out.println(task.execute(50, 10));
		
		task = Multiplication::multiply;
		System.out.println(task.execute(50, 10));

	}
}
