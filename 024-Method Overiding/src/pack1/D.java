package pack1;

public class D extends C {

	// Constructor cannot be overriden
	public C() {
		
	}

	public D() {

	}

	// private methods in superclass cannot be overriden in sublclass
	@Override
	public void f1(int a) {

	}

	// private methods can be refined in sub class
	private void f1() {

	}

	// static methods can be redefined ,not considered as overriding
	public static void f2() {

	}
	//Static methods cannot be redefined as instance method in overriding	
	public  void f2(int a) {
		      
	}

	// For Overriding ,return type should be same
	//Also Parameters should not change in overriding
	//Function name should be same
	//Inheritance is  required
	//Overriding can be done in subclass
	public int f3(int a) {
		return a;

	}
	//Instance method cannot be redefined as static method
	public static void f4() {
		
	}
	
	//Access level increased
	protected void f5 () {
		
	}
	//Access level should not be reduced
	private void f5 (int a) {
		
	}
	//final method cannot be overrided
	public  void f6() {
		
	}
}
