
public class SquareClient {
	public static void main(String[] args) {
		Square square = new Square();
		square.setSize(-10);
		System.out.println(square.getSize());
		System.out.println(square.getArea());
		square.setSize(20);
		System.out.println(square.getSize());
		System.out.println(square.getArea());
		
	
	}
}
