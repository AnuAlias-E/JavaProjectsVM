
public class Main4 {
	public static void main(String[] args) {
		int v1 = 40;
		long v2 = 900;

		long res1 = v1 + v2 + 100;//multi or mixed mode exprn ,explicit conversion
		float res2 = v1 + v2 + 10.0f;//multi or mixed,explicit conversion
		byte v3 = 88;
		short v4 = 99;
		double res3 = v3 + v4 + v2 + 10.0;// multi ormixed,explicit conversion
		int res4 = v3 + 10 + 20 * 40;//multi or mixed,explicit conversion
	}
}
