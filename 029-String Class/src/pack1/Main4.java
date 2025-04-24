package pack1;

public class Main4 {
public static void main(String[] args) {
	
	String s1="Delhi";
	String s2="Delhi";
	String s3= new String("Delhi");
			
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	System.out.println(s1.equals(s3));
}
}
