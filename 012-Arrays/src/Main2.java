
public class Main2 {
public static void main(String[] args) {
	double[]discounts;
	discounts=new double[5];
	System.out.println(discounts.length);
	for(int i=0;i<discounts.length;i++) {
		System.out.println(discounts[i]);
	}
	discounts[0]=0.15;
	discounts[1]=0.5;
	discounts[2]=0.22;
	discounts[3]=0.18;
	for(int i=0;i<discounts.length;i++) {
		System.out.println(discounts[i]);
	}
	discounts=null;
}
}
