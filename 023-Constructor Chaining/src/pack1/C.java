package pack1;

public class C extends B {
	int z;

	public C(int x, int y, int z) {
		super(x, y);
		this.z = z;
		System.out.println("C constructor created with 3 arguments: " + x + " " + y + " " + z);
	}

	public C(int x, int y) {
		super(x, y);
		System.out.println("C constructor created with 2 arguments: " + x + " " + y);

	}

	public C(int x) {
		super(x);
		System.out.println("C constructor created with 1 arguments: " + x);
	}

	public C() {
		super();
		System.out.println("C constructor created without arguments: ");
	}
}
