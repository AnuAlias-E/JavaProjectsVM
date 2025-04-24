package pack1;

public class A {

	private int v1;// Access only with in the class
	int v2;// default access level by the friends
	protected int v3;// access to the all subclasses or friends class
	public int v4;// All classes can access
	
	public A(){
		
	}
	protected void display() {
		
	}
	public void test1() {
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
	}

}
