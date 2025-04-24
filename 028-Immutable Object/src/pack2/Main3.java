package pack2;

import pack1.Circle;

public class Main3 {
	public static void main(String[] args) {
		Circle circle1 = new Circle(10);
		Circle circle2 = new Circle(20);
		System.out.println(circle1);
		System.out.println(circle2);

		Circle circle3 = circle1.enLarge(100);
		System.out.println(circle3);

		Circle circle4 = circle1.enLarge(500);
		System.out.println(circle4);

	}
}
