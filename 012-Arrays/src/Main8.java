
public class Main8 {
public static void main(String[] args) {
	int[] array = { 14, 20, 30, 10 };
	//task2
	//find the and print the minimum values in this array
	//find the and print the maximum values in this array
	System.out.println("The elements are ");
	for(int element:array) {
		System.out.println(element);
	}
	int minElement=array[0];
	for(int num :array) {
	
		if(minElement>num) {
			minElement=num;
		}
	}
	System.out.println("The Minimum value is "+minElement);
	int maxElement=array[0];
	for(int num :array) {
		
		if(maxElement<num) {
			maxElement=num;
		}
	}
	System.out.println("The maximum value is "+maxElement);
}
}
