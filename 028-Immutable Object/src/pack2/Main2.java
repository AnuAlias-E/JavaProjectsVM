package pack2;

import pack1.Square;

public class Main2 {
	public static void main(String[] args) {
		Square square1 = new Square(10);
		Square square2 = new Square(20);
		
		System.out.println(square1);
		System.out.println(square2);

		Square square3 = square1.enLarge(100);
		System.out.println(square3);

		Square square4 = square1.enLarge(500);
		System.out.println(square4);

	}
}
