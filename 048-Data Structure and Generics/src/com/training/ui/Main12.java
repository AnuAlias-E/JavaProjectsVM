package com.training.ui;

import com.training.ds.Stack;
import com.training.ds.StackImpl;
import com.training.model.Person;

public class Main12 {

	public static void main(String[] args) {
		try {
		Stack<Person> stack = new StackImpl<>(10);
		stack.push(new Person("Anu Alias",  40));
		stack.push(new Person("Renju P V",  32));
		stack.push(new Person("Myna", 39));
		stack.push(new Person("Rahul", 55));
		stack.push(new Person("ANIL",  23));

		
		System.out.println(stack);
		System.out.println("---------------------------");
		Person person = stack.pop();
		System.out.println(stack);
		System.out.println("---------------------------");
		System.out.println("Removed Element");
		//System.out.println(billItem1);
		System.out.println("Person Name: "+person.getName() + " , Age: " + person.getAge() );
		System.out.println("---------------------------");
		Person person2 = stack.pop();
		System.out.println(stack);
		System.out.println("---------------------------");
		System.out.println("Removed Element");
		//System.out.println(billItem1);
		System.out.println("Person Name: "+person2.getName() +  " , Age: " + person2.getAge() );
		System.out.println("---------------------------");
		}catch (Throwable e) {
			System.err.println(e.getMessage());
		}

	}


}
