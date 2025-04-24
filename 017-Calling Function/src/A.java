
public class A {
	int x;// instance variable
	static int y;// static variable

	void printX() {// Instance Method
		System.out.println(this.x);
		printWelcome();
		System.out.println(y);
		printGoodBye(); 
		new A();
		new A(10);
	}

	void printWelcome() {// Instance Method
		System.out.println("WELCOME!!");
	}

	static void printY() {//static method
	//	System.out.println(x);Cannot access instance variable
	//	printWelcome();Cannot access intance method
		printGoodBye();
		new A();
		System.out.println(y);
		// System.out.println(this.x);//this is error,cannot access non sttsic variables
		

	}

	static void printGoodBye() {//static method
		System.out.println("GOOD BYE!!");
	}

	A() {//constructor method
		
		System.out.println("A Object Created");
		System.out.println(this.x);
		printWelcome();
		System.out.println(y);
		printGoodBye();
		
		//A(10);cannot call other constructor method like this
	}

	A(int x) {//constructor method
		
		System.out.println("A object created with " + x);
		this.x = x;
	}
}
