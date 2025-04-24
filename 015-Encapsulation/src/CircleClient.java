
public class CircleClient {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(-10);
		System.out.println(circle.getRadius());
		System.out.println(circle.getArea());
		
		Circle circle1 = new Circle();
		circle1.setRadius(10);
		System.out.println(circle1.getRadius());
		System.out.println(circle1.getArea());

	}

}
