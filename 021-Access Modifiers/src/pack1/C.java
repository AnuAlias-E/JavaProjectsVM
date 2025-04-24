package pack1;

public class C extends A {

	public void test6() {
		// System.out.println(v1);//cannot access because v1 is private variable
		System.out.println(v2);// can access , friend of A
		System.out.println(v3); // can access , subclass of A
		System.out.println(v4);// can access
		display();
	}

	public void test7() {
		A a = new A();
		// System.out.println(a.v1);//cannot access because v1 is private variable
		System.out.println(a.v2);// can access , its friendly client
		System.out.println(a.v3); // can access , friendly subclass of A
		System.out.println(a.v4);// can access
		a.display();
	}
}
