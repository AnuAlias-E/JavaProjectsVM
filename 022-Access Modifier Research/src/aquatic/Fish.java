package aquatic;

public class Fish {

	public String name;
	private String food;
	protected String place;
	
	public Fish() {
		
	}

	public Fish(String name, String food, String place) {
		
		this.name = name;
		this.food = food;
		this.place = place;
	}

	
	
	private void getInfo() {
		System.out.println("Informations");
	}

	protected void eatFood() {
		System.out.println("Eating small fishes");
	}

	public void move() {
		System.out.println("Swimming ");
	}
	public void displayDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Food: "+ food);
		System.out.println("Place: "+ place);
		
		getInfo();
		eatFood();
		move();
	}
}
