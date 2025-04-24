
public class AClient {
	public static void main(String[] args) {
		A obj = new A();
		obj.test1();
		obj.test1(true);
		obj.test1(34, 10.0f);
		A.test1(35, 10.0f,800.00);
	}
}
