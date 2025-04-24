
public class CClient {
public static void main(String[] args) {
	System.out.println(C.count);
	C obj = new C();
	obj.name="Anu";
	C.count++;
	C.printCount();
	obj.printName();
	
	C obj1 =new C();
	obj1.name="Mathew";
	C.count++;
	obj1.printName();
	C.printCount();
	
	
	C obj2 =new C();
	obj2.name="Mats";
	C.count++;
	obj2.printName();
	C.printCount();
	
}
}
