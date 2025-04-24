package com.training.model;

public class E implements A,B,X  {

	@Override
	public void f1() {
		System.out.println("f1 in E class");
	}

	@Override
	public void f2() {
		System.out.println("f2 in E class");
	}

	@Override
	public void f4() {
		System.out.println("f4 in E Class");
		B.super.f4();
	}

	@Override
	public void fun9() {
		System.out.println("fun9 in E Class");
		
	}
	
	
}
