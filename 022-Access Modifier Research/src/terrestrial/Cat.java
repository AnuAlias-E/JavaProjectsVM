package terrestrial;

public class Cat extends Animal{
 
	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Food: " + food);
		System.out.println("Place: " + place);
		System.out.println("Movement"+ movement);

		getInfo();
		eatFood();
		move();
		
		Animal animal=new Animal("Lion", "NonVEg", "Forest");
		animal.displayDetails();
		
		Dog dog =new Dog();
		dog.name="Labrador";
		dog.food="Egg";
		dog.place="Kennel";
		dog.displayDetails();
		dog.getInfo();
		dog.eatFood();
		dog.move();
	}

	private static void getInfo() {
		System.out.println("Information about Cat");
	}

	protected  void eatFood() {
		System.out.println("Eating "+food);
	}

	public void move() {
		System.out.println("Walking ");
	}
	
	public void display1() {
		displayDetails();
	}
}
