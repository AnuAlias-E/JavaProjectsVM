package pack1;

public class Main1 {
public static void main(String[] args) {
	int a=100;
	//Supressed
//	Integer inObj1= new Integer(100);
	
	Integer iobj1= Integer.valueOf(100000);//Wrapping,Boxing
	byte v1=iobj1.byteValue();
	System.out.println(v1);
	
	short v2=iobj1.shortValue();
	System.out.println(v2);
	
	int v3=iobj1.intValue();//unboxing
	System.out.println(v3);
	
	long v4=iobj1.longValue();
	System.out.println(v4);
		
	float v5=iobj1.floatValue();
	System.out.println(v5);
	
	double v6=iobj1.doubleValue();
	System.out.println(v6);
	
	System.out.println(Integer.MIN_VALUE);
	System.out.println(Integer.MAX_VALUE);
	
	System.out.println(Integer.toBinaryString(655));
	
	System.out.println(Integer.toOctalString(655));
	
	System.out.println(Integer.toHexString(655));
	System.out.println(Integer.toString(655,2));
	System.out.println(Integer.toString(655,8));
	System.out.println(Integer.toString(655,10));
	
	//int x=Integer.parseInt("125abcd");
	//System.out.println(++x);
	
	Integer obj1=Integer.valueOf(100);
	Integer obj2=Integer.valueOf(100);
	Integer obj3=Integer.valueOf(200);
	
	System.out.println(obj1.equals(obj2));
	System.out.println(obj1.equals(obj3));
	
	int r=obj1.compareTo(obj2);
	
	if(r<0)
		System.out.println("Invoking object is lesser than parameter object");
	if(r==0)
		System.out.println("Invoking object is same as parameter object");
	if(r>0)
		System.out.println("Invoking object is higher than parameter object");
Integer obj4=127;//AutoBoxing
Integer obj5=127;
System.out.println(obj4==obj5);

}
}
