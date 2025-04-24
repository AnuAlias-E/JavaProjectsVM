package pack2;

import pack1.A;

public class E extends A {

	public void test4() {

		// System.out.println(v1);cANNOT ACCESS
		// System.out.println(v2);CANNOT ACCESS
		System.out.println(v3);
		System.out.println(v4);
		display();
	}

	public void test5() {
		A a = new A();

		// System.out.println(a.v1);cannot access because v1 is private variable
		// System.out.println(a.v2);
		// System.out.println(a.v3);//cannot access because its a.v3  is client variable
		System.out.println(a.v4);
	}
}
