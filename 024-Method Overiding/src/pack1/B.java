package pack1;

public class B extends A {
	public B() {
		
	}
	@Override
	public void f1(int a) {
		System.out.println("f1 in B " + a);
	}
	public void f2(int a) {
		System.out.println("f2 in B"+a);
	}
	
	
	public static void f3(float f) {
		System.out.println("f3 in B " + f);
	}
	
	public  void f4(double d) {
		System.out.println("f4 in B " + d);
	}
}

