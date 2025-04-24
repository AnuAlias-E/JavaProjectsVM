package pack1;

public class B {

	private int x, y;

	public B() {
		System.out.println("Default constructor without arguemnts");
	}

	public B(int x) {
		this();
		this.x = x;
		System.out.println("B object created with one arguement: " + x);
	}

	public B(int x, int y) {
		this(x);
		this.y = y;

		System.out.println("B object created with two arguements: " + x + " , " + y);

	}
	
	public void display() {
		System.out.println(this.x + " " + this.y );
	}
}
