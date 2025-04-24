package pack1;

public class Main9 {
public static void main(String[] args) {
	char ch='A';
	Character obj1= Character.valueOf(ch);//boxing
	char ch1=obj1.charValue();//unboxing
	
	//Conversion methods not available

	System.out.println(Character.isAlphabetic(66));
	System.out.println(Character.isDigit(50));
	System.out.println(Character.isLetter('A'));
	System.out.println(Character.isLowerCase('m'));
	System.out.println(Character.isUpperCase('A'));
	
}
}
