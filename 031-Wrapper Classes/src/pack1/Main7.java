package pack1;

public class Main7 {
	public static void main(String[] args) {

		Integer obj1 = Integer.valueOf(200);// boxing
		int x = 500;

	//	Integer obj2 = Integer.valueOf(x);// Boxing
		Integer obj2 = x;//Auto Boxing
		//int y= obj2.intValue();//unboxing
		int y = obj2;// Auto unboxing
		System.out.println(obj2);
	
		obj2++;//it will call obj2.intValue()Increment the extracted value,new object...Integer.valueOf(incrementedData),
		//obj2 is pointed to the reference.old obj2 is garbage collected
		System.out.println(obj2);
		x++;
	}

}
