package terrestrial;

public class Dog extends Animal{
	
		public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Food: " + food);
		System.out.println("Place: " + place);

		getInfo();
		eatFood();
		move();
	}

	private static void getInfo() {
		System.out.println("Information about dog");
	}

	protected void eatFood() {
		System.out.println("Eating"+ food);
		
	}

	public static void move() {
		System.out.println("Walking ");
	}
}
