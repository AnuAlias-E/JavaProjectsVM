package pack1;

public class A {
	int x, y, z;

	public A() {
		System.out.println("A object created");
		System.out.println("-----------------");
	}

	public A(int x) {
		this();
		this.x = x;
		System.out.println("A object created with one arguement: " + x);		
	}

	public A(int x, int y) {
		this(x);
		this.y = y;

		System.out.println("A object created with two arguements: " + x + " , " + y);

	}

	public A(int x, int y, int z) {
		this(x, y);
		this.z = z;
		System.out.println("A object created with three arguements: " + x + " " + y + " " + z);

	}

	public void display() {
		System.out.println(this.x + " " + this.y + " " + this.z);
	}
}
