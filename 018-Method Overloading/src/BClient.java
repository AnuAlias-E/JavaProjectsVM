
public class BClient {
	public static void main(String[] args) {
		B obj = new B();
		obj.operate(10,670);
		obj.operate('H', "Welcome");
		obj.operate(10, 200.0f, 19.00);
		System.out.println("Addition with character : "+obj.operate(30));
		System.out.println("Addition of two integers and double: "+B.operate(30, 25, 600.00));
	}
}
