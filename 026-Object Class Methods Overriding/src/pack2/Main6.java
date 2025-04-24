package pack2;

import pack1.Square;

public class Main6 {
public static void main(String[] args) {
	Square square1 =new Square(100);
	Square square2 =new Square(100);
	Square square3 =new Square(200);
	System.out.println(square1.equals(square2));
	System.out.println(square1.equals(square3));
}
}
