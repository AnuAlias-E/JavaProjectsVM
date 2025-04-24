import java.util.Arrays;

public class Main11 {
public static void main(String[] args) {
	int size=4;
	int[]array =new int[-9];//NegativeArraySizeException
	
	
	System.out.println(Arrays.toString(array));
	array[0]=50;
	array[1]=80;
	array[2]=100;
	array[3]=200;
	array[30]=900;//ArrayIndexOutOfBoundsException
	
	System.out.println(Arrays.toString(array));
array=null;
array[0]=7;//Nullpointerexception
}
}
