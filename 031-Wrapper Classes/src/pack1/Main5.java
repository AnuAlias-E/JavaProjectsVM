package pack1;

public class Main5 {
	public static void main(String[] args) {

		float b = 100.00f;
		Float obj1 = Float.valueOf(b);// Boxing

		byte v1 = obj1.byteValue();
		System.out.println(v1);

		short v2 = obj1.shortValue();
		System.out.println(v2);

		int v3 = obj1.intValue();
		System.out.println(v3);

		long v4 = obj1.longValue();
		System.out.println(v4);

		float v5 = obj1.floatValue();// UnBoxing
		System.out.println(v5);

		double v6 = obj1.doubleValue();
		System.out.println(v6);

		String str = "98.00";
		float x = Float.parseFloat(str);
		System.out.println(++x);

		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);

	}
}
