package pack1;

public class Main3 {
public static void main(String[] args) {
	short b=563;
	Short obj1 =Short.valueOf(b);//Boxing
	
	byte v1=obj1.byteValue();
	System.out.println(v1);
	
	short v2=obj1.shortValue();//UnBoxing
	System.out.println(v2);
	
	int v3=obj1.intValue();
	System.out.println(v3);
	
	long v4=obj1.longValue();
	System.out.println(v4);
	
	float v5=obj1.floatValue();
	System.out.println(v5);
	
	double v6=obj1.doubleValue();
	System.out.println(v6);
	
	String str="98";
	short x=Short.parseShort(str);
	System.out.println(++x);
	
	System.out.println(Short.MIN_VALUE);
	System.out.println(Short.MAX_VALUE);
}
}
