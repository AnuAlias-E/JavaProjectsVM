
public class SquareClient {

	public static void main(String[] args) {
		// Three variables of square
		Square s1 = new Square();
		s1.size = 10;
		System.out.println("Square1");
		System.out.println("Size: " + s1.size);
		System.out.println("Area: " + s1.getArea());
		s1=null;
		Square s2 = new Square();
		s2.size = 300;
		System.out.println("Square2");
		System.out.println("Size: " + s2.size);
		System.out.println("Area: " + s2.getArea());
		s2=null;
		Square s3 = new Square();
		s3.size = 50;
		System.out.println("Square3");
		System.out.println("Size: " + s3.size);
		System.out.println("Area: " + s3.getArea());
		s3=null;
	}

}
