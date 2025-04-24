import java.util.Arrays;

public class C {

	void display(double p) {
		System.out.println("Display With Double: " + p);
	}

	void display(int p) {
		System.out.println("Display With INT: " + p);
	}
	
	void display(int ...p) {
		System.out.println("Display With INT []Array: " + Arrays.toString(p));
	}
	/**
	 * This is not preferable over ellipsis
	void display(int []p) {
		System.out.println("Display With INT []: " + Arrays.toString(p));
	}*/
	
	
	void display(byte a) {
		System.out.println("Display with BYTE : "+ a);
	}
}
