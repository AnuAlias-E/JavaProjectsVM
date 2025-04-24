package pack1;

public class Main1 {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Welcome");
		s1.append(" to ");
		s1.append(" UST-Global ");
		s1.append("TVM Center");
		System.out.println(s1);

		s1.append(50);
		s1.append('A');
		s1.append(true);
		s1.append(50.0);
		System.out.println(s1);
		
		s1.insert(5, " JAVA ");
		s1.insert(10, true);
		System.out.println(s1);
		
		s1.delete(10,20);
		System.out.println(s1);
		System.out.println(s1);
		
		s1.deleteCharAt(5);
		s1.setCharAt(6, 'W');
		String str=  s1.toString();
		
		System.out.println(str);
	}
}
