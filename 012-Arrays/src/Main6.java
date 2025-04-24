import java.util.Scanner;

public class Main6 {
public static void main(String[] args) {
	long []profits;
	int arraySize;
	//take input for the size at runtime
	//create an array(intializw
	//take input for each element
	//print elements
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size");
	arraySize=sc.nextInt();
	System.out.println("Enter the elements");
	profits=new long[arraySize];
	for(int i= 0;i<arraySize;i++) {
		profits[i]=sc.nextLong();
	}
	System.out.println("The elements are");
	for(long profit : profits) {
		System.out.println(profit);
	}
	profits=null;
}
}
