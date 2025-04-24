package pack1;

public class Main1 {

	public static void main(String[] args) {
		String s = new String("Welcome");
		System.out.println(s);
		System.out.println(s.length());
		char[] arr = { 'a', 'b', 'c', 'd' };
		String s1 = new String(arr);
		System.out.println(s1);
		System.out.println(s1.length());
		
		byte[] arr1 = { 65,66,67,68,69};
		String s2=new String(arr1);
		System.out.println(s1);
		System.out.println(s2);
	}

}
