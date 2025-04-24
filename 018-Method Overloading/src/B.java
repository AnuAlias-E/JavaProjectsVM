
public class B {
	
	public void operate(int a, int b) {
		
		int sum= a+b;
		System.out.println("Addition of integers: "+sum);
		
	}
	
	public void operate(int a,float b ,double c) {
		double product = a*b*c;
		System.out.println("Product of numbers:"+product);
	}
	
	public void operate(char a,String b ) {
		String str = a+b;
		System.out.println("String Concatenation: "+str);
	}
	
	public static double operate (int a,int b,double c) {
		double value= (a*b)+c;
		return value;
	}
	
	public int operate(int a) {
		char s= 'A';
		return s+a;
	}

}
