package pack2;

import pack1.A;
import pack2.F;

public class D {

	
public void test3() {
	A a=new A();
	//System.out.println(a.v1);cannot access because v1 is private variable
		//	System.out.println(a.v2); cannot access because it is in different package
		//	System.out.println(a.v3);cannot access because it not a subclass of A
			System.out.println(a.v4);
	
}

public void test8() {
	//F obj = F(); because F is non public class
	
}
}
