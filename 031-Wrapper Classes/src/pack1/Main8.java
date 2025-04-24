package pack1;

public class Main8 {
public static void main(String[] args) {
	Double obj1 = Double.valueOf(200.00);// boxing
	System.out.println("Boxing with literal: "+obj1);
	double x = 600.34;

	Double obj2 = Double.valueOf(x);// Boxing
	System.out.println("Boxing with variable: "+obj2);//boxing
	
	Double obj3 = 300.98;//Auto Boxing
	System.out.println("Auto Boxing with literal: "+obj3);
	double y = obj2;// Auto unboxing
	System.out.println("Auto unboxing with variable: "+obj2);

	obj2++;

	System.out.println("Modified obj2: "+obj2);
	
	x++;
	System.out.println("Modified x: "+x);
}
}
