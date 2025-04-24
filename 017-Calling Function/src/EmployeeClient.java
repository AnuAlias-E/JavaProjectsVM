
public class EmployeeClient {
	
	public static void test1(int a) {
		System.out.println("Inside test1 before increment: "+a);
		a++;
		System.out.println("Inside test1 after increment: "+a);
		
	}

	public static void main(String[] args) {
	int age =40;
	System.out.println("Inside Main before function call: "+age);
	test1(age);
	System.out.println("Inside Main after function call: "+age);
	}

}
