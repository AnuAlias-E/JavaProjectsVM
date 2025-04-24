
public class CircleClient {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.radius = 5;
		System.out.println(c1.radius);
		System.out.println(Circle.PI);
		System.out.println(c1.getArea());
		Circle.PI=4.0;
		System.out.println(Circle.PI);
		Circle c2 = new Circle();
		c2.radius = 10;
		System.out.println(c2.radius);
		
		System.out.println(Circle.PI);
		System.out.println(c2.getArea());
		Circle c3 = new Circle();
		c3.radius = 20;
		System.out.println(c3.radius);
		System.out.println(Circle.PI);
		System.out.println(c3.getArea());
	}

}
