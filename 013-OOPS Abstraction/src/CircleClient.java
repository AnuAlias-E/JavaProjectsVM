
public class CircleClient {

	public static void main(String[] args) {
	Circle c1;//local varaible Circle datatype//reference varaible

	c1= new Circle();//allocating the memory to that object  variable
	System.out.println("Before Initialization");
	System.out.println("Radius "+c1.radius);
	System.out.println("Area "+c1.computeArea());
	
	c1.radius=5;
	System.out.println("After Initialization");
	System.out.println("Radius "+c1.radius);
	System.out.println("Area "+c1.computeArea());
	
	c1=null;
	Circle c2=new Circle();
	c2.radius=10;
	System.out.println("Radius "+c2.radius);
	double areaOfC2 = c2.computeArea();
	System.out.println("Area "+areaOfC2);
	
	Circle c3 = new Circle();
	c3.radius=50;
	System.out.println("Area: "+c3.computeArea());
	}

}
