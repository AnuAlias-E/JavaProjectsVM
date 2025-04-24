
public class A {
	void test1(int a, float b) {
		System.out.println("test1: " + a + " " + b);
	}

	static void test1(int a, float b, double c) {
		System.out.println("test1: " + a + " " + b + " " + c);
	}
	
	void test1() {
		System.out.println("test1");
	}
	
	int test1(boolean isAvailable) {
		System.out.println("test1 with boolean: "+isAvailable);
		return 0;
	}
}
