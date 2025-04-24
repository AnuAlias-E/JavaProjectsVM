package pack3;

import pack1.A;
import pack1.B;
import pack1.C;
import pack1.D;
import pack1.E;

public class Main1 {
	public static void main(String[] args) {
		A obj;
//	obj=new A();//Cannot create objects for abstract class
		obj = new B();
		obj.test1();
		obj.test2();
		obj.test3();
		System.out.println("-----------------");
		obj = new C();
		obj.test1();
		obj.test2();
		obj.test3();
		System.out.println("-----------------");

		
		obj=new E();
		obj.test1();
		obj.test2();
		obj.test3();
	}
}
