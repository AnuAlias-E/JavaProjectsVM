package aerial;

import terrestrial.Animal;
import terrestrial.Cat;

public class Bird {
	public String name;
	private String food;
	protected String place;
	
	
	public Bird() {
		
	}


	public Bird(String name, String food, String place) {
		
		this.name = name;
		this.food = food;
		this.place = place;
	}
	
	private void getInfo() {
		System.out.println("Informations about birds");
	}

	protected void eatFood() {
		System.out.println("Eating worms");
	}

	public void move() {
		System.out.println("Fiying ");
	}
	public void display2() {
		System.out.println("Name: "+ name);
		System.out.println("Food: "+ food);
		System.out.println("Place: "+ place);
		
		getInfo();
		eatFood();
		move();
		
		
		Animal animal = new Animal("Parrot","Worms","Nest");
		animal.displayDetails();
		
		Cat.getInfo();
	}
}
