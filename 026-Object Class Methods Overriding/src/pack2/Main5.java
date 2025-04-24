package pack2;

import pack1.Circle;
import pack1.Square;

public class Main5 {
	public static void main(String[] args) {
		int a = 100;
		int b = 100;
		System.out.println(a == b);
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(20);

		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(null));
		System.out.println(c1.equals(c2));
	}
}
