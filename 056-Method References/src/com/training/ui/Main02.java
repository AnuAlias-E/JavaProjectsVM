package com.training.ui;

import com.training.model.pack2.GoodBye;
import com.training.model.pack2.Greet;
import com.training.model.pack2.Hello;
import com.training.model.pack2.Welcome;

public class Main02 {
public static void main(String[] args) {	
	Hello hello;
	
	Welcome w= new Welcome();
	GoodBye g = new GoodBye();
			
	Greet greet= new Greet();
	
	hello=()->System.out.println("Welcome");
	hello.doIt();
	hello=()->System.out.println("Good Bye");
	hello.doIt();
	
	hello=()->System.out.println("Hi....How are you");
	hello.doIt();
	
	//Method Reference for non-static method 
	//we should create an abject of the class
	
	hello=w::sayWelcome;
	hello.doIt();
	hello=g::sayGoodBye;
	hello.doIt();
	
	hello=greet::greet;
	hello.doIt();
	
}
}
