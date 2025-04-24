package pack1;

public class B {
	public void test2() {
		A a= new A();
		//System.out.println(a.v1);cannot access because v1 is private variable
		System.out.println(a.v2);
		System.out.println(a.v3);
		System.out.println(a.v4);
		a.display();
		
	}

}
