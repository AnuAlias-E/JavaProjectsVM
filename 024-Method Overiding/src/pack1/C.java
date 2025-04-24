package pack1;

public class C {

	public C() {

	}

	// Overloading
	public C(int a) {
		System.out.println("Constructor with arguments " + a);
	}

	private void f1() {
		System.out.println("f1() in C");
	}

	// overloading private methods is possible
	private void f1(int a) {
		System.out.println("f1 () in C with arguments" + a);
	}

	public static void f2() {

	}
	//Static methods can be overloaded
	public static void f2(int a) {

	}
	//Static method can be overloaded as instance method
	public void f2(int a,int b) {
		System.out.println(a+" "+b);
	}
	
	//Parameters should change in overloading
	//Function name should be same
	//Inheritance is not required
	
	public int f3(int a) {
		return a;
		
	}
	//overloading can allow different return types
	//Function name should be same
	//Overloading can be done in same class
	public void f3() {
		
	}
	
	public  void f4() {
		
	}
	//Instance method can be redefined as static method
	public static void f4(int a) {
		
	}
	
	private void f5() {
		
	}
	
	public void f5(int a) {
		
	}
	public final void f6() {
		
	}
}
