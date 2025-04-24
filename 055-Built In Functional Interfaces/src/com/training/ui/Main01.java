package com.training.ui;

import java.util.function.Consumer;

public class Main01 {
	public static void main(String[] args) {
		Consumer<String> consumer1;
		consumer1 = s -> System.out.println(s.length());

		consumer1.accept("Welcome");
	
		
		Consumer<Integer>consumer2=null;
		
		consumer2=i->System.out.println(i.doubleValue());
		consumer2.accept(Integer.valueOf(80));
		
	}
}
