package pack2;

import pack1.A;
import pack1.B;

public class Main2 {
public static void main(String[] args) {
	A obj = new A();
	obj.f1(100);
	B obj2 =new B();
	obj2.f1(200);
	A.f3(8.0f);
	B.f3(100.90f);
}
}
