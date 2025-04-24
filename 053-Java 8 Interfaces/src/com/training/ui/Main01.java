package com.training.ui;

import com.training.model.A;
import com.training.model.C;
import com.training.model.D;
import com.training.model.E;
import com.training.model.X;

public class Main01 {
	public static void main(String[] args) {
		A obj;
		obj = new C();
		obj.f1();
		obj.f2();
		obj.f3();
		obj.f4();
		
		System.out.println("---------------");
		A.f5();
		System.out.println("---------------");
		//X.fun8();
		System.out.println("---------------");
		X obj1 = new C();
		obj1.fun7();
		obj1.fun9();
		
		System.out.println("---------------");
		obj1 = new D();
		obj1.fun7();
		obj1.fun9();
		
		System.out.println("---------------");
		obj1 = new E();
		obj1.fun7();
		obj1.fun9();
		X.fun8();
	}
}
