
public class Main3 {
	public static void main(String[] args) {
		float[] array;
		array = new float[] { 0.4f, 0.9f, 4.5f };
		System.out.println(array.length);
		System.out.println("-------------");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("-------------");
		for (float element : array) {//for each
			System.out.println(element);
		}
		
		array=null;
	}
}
