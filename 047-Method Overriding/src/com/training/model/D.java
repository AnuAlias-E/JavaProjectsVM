package com.training.model;

import java.io.IOException;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class D extends C {

	// Rule1 : zero number of exception exceptions listed in super class method
	@Override
	public void test1(){

	}

	// Rule1 : more number of exceptions exceptions listed in super class method
	@Override
	public void test2()throws IOException,InterruptedException,NullPointerException {

	}

	// Rule2 : less number of exceptions than exceptions listed in super class method
	public void test3() throws IOException {

	}

	// Rule3 : Cannot throw any new checked exception that is not listed in super class method

	@Override
	public void test4()throws IOException,InterruptedException,SQLException {

	}

	// Rule4 : Cannot throw any number of new unchecked exception that is not listed in super class method
	@Override
	public void test5() throws IOException, InterruptedException, NullPointerException,NumberFormatException {

	}
	
	
//Rule 5 :Cannot use narrow exception classes than exceptions listed in super class method
	@Override
	public void test6() throws SQLException {

	}
	
	//Rule 6 :Can wider exception classes than exceptions listed in super class method
		@Override
		public void test7() throws ArithmeticException,NullPointerException {

		}
}
