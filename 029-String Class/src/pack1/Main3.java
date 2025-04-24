package pack1;

public class Main3 {
	public static void main(String[] args) {
		String s1 = new String("Welcome");
		String s2 = new String("Welcome");
		String s3 = new String("welcome");

		System.out.println((s1 == s2));
		System.out.println((s1.equals(s2)));
		System.out.println((s1.equals(s3)));
		System.out.println((s1.equalsIgnoreCase(s3)));

		String s4 = new String("America");
		String s5 = new String("America");

		int r = s4.compareTo(s5);
		System.out.println(r);

		if (r < 0)
			System.out.println("s4 is less than s5");

		if (r == 0)
			System.out.println("s4 is same as s5");
		if (r > 0)
			System.out.println("s4 is greater than s5");
	}
}
