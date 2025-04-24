
public class Main1 {
public static void main(String[] args) {
	int age=50;
	
	int[]years;//array declaration
	years = new int[3];//array initialization and array creatiion
	System.out.println(years.length);
	System.out.println("------------------");
	System.out.println(years[0]);
	System.out.println(years[1]);
	System.out.println(years[2]);
	System.out.println("------------------");
	for(int i=0;i<years.length;i++) {
		System.out.println(years[i]);
	}
	years[0]=1991;
	years[1]=2000;
	years[2]=2010;
	System.out.println("------------------");
	for(int i=0;i<years.length;i++) {
		System.out.println(years[i]);
	}
	years=null;
}
}
