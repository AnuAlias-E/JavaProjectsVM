package pack1;

public class Main2 {
	public static void main(String[] args) {
		String s = new String("Welcome to UST-global , Cochin Center, India");
		System.out.println(s);
		System.out.println(s.length());

		System.out.println(s.charAt(2));
		System.out.println(s.charAt(s.length() - 1));

		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}

		System.out.println();
		System.out.println(s.contains("Cochin"));
		System.out.println(s.contains("TVM"));

		System.out.println(s.startsWith("Welcome"));
		System.out.println(s.startsWith("Java"));
		System.out.println(s.endsWith("India"));

		System.out.println(s.indexOf("UST"));
		System.out.println(s.indexOf('C'));
		System.out.println(s.lastIndexOf('C'));
		System.out.println(s.indexOf('C', 25));
		System.out.println(s.lastIndexOf('C', 25));

		String s1 = s.substring(11);
		System.out.println(s1);

		String s2 = s.replace('C', 'c');
		System.out.println(s2);
		
		String s3 = s.substring(5, 10);
		System.out.println(s3);
		
		String s4 = s.toUpperCase();
		System.out.println(s4);
		
		String s5 = s.toLowerCase();
		System.out.println(s5);
		
		String s6 = String.format("%5d ,%20s, %.2f", 10,"WELCOME",20.0f);
		System.out.println(s6);
	}
}
