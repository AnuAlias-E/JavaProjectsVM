
public class AClient1 {
	public static void main(String[] args) {
		System.out.println(A.y);
		A.printY();
		A.printGoodBye();
		System.out.println("-------------");
		A obj1 = new A();

		System.out.println(obj1.x);
		obj1.printX();
		obj1.printWelcome();
		System.out.println("-------------");
		A obj2 = new A(10);
		System.out.println(obj2.x);
		obj2.printX();
		obj2.printWelcome();
	}
}
