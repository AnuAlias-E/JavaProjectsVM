
public class CClient {
public static void main(String[] args) {
	C obj= new C();
	obj.display(100);
	int v1= 900;
	obj.display(v1);
	
	short v2=800;
	obj.display(v2);
	
	byte v3=77;
	obj.display(v3);
	
	char v4='L';
	obj.display(v4);
	
	long v5=1000;
	obj.display(v5);
	
	float v6=90.0f;
	double v7=8760.89;
	
	obj.display(v6);
	obj.display(v7);
	
	obj.display(90,89,10,34,322);
	obj.display(new int[] {10,90,50});
	
	obj.display((byte)50);
}
}
