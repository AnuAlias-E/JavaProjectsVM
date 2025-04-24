
public class Circle {
	private int radius;

	double getArea() {
		return 3.14 * radius * radius;
	}

	void setRadius(int rad) {
		if(rad<0) {
			System.out.println("Invalid Radius");
			return;
		}
		radius = rad;
	}
	
	int getRadius() {
		return radius;
	}

}
