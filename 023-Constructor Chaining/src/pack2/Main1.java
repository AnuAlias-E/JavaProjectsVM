package pack2;

import pack1.A;

public class Main1 {
	public static void main(String[] args) {
		A obj= new A();
		obj.display();
		
		A obj1= new A(5);
		obj1.display();
		
		A obj2= new A(5,4,7);
		obj2.display();
	}
}
