package terrestrial;

public class Animal {
	public String name;
	protected String food;
	private String place;
	protected static String movement;
	public Animal() {
		
	}
	public Animal(String name, String food, String place) {
		
		this.name = name;
		this.food = food;
		this.place = place;
	}
	
	protected void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Food: " + food);
		System.out.println("Place: " + place);

	
		
		}
	
	protected static void display2() {
		System.out.println("Movement: " + movement);
		System.out.println("Food: " + Food);
	
		
		}

}
