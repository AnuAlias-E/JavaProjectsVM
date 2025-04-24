package pack1;

public class A {
	public A() {
		
	}
	public void f1(int a) {
		System.out.println("f1 in A " + a);
	}

	private void f2(int a) {
		System.out.println("f2 in A " + a);
	}

	public static void f3(float f) {
		System.out.println("f3 in A " + f);
	}
	
	public final void f4(double d) {
		System.out.println("f4 in A " + d);
	}
}
