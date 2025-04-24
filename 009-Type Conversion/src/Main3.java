
public class Main3 {
public static void main(String[] args) {
	int v1=30;
	int v2=40;
	long v3=50;
	double v4=60;
	int result=v1+v2;//single mode expression
	
	short result1=(short) (v1+v2);//narrow conversion
	
	long result2=v1+v2+v3;//multi or mixed mode expression
	
	int result3=v1+v2+v3;//error ,should use narrow conversion
	
	double result4=v1+v2+v3+v4;
	
	byte v5=6;
	short v6=7;
	int result5=v5+v6;
	
	int result6=(int)(v1+v2+v4);
	
	float result7=(float)(v1+v2+v3+v4);
	
}
}

