package pack1;

public class Main2 {
public static void main(String[] args) {
	byte b=100;
	Byte obj1 =Byte.valueOf(b);//Boxing
	
	byte v1=obj1.byteValue();//UnBoxing
	System.out.println(v1);
	
	short v2=obj1.shortValue();
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
	byte x=Byte.parseByte(str);
	System.out.println(++x);
	
	System.out.println(Byte.MIN_VALUE);
	System.out.println(Byte.MAX_VALUE);
	
	
}
}
