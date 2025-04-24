package animal;

import terrestrial.Animal;
import terrestrial.Dog;

public class Main {

	public static void main(String[] args) {
		Animal animal =new Animal("Lion", "NonVeg", "Forest");
		animal.displayDetails();
		
		Dog dog = new Dog();
		dog.name="PUG";
		dog.food="Fish";
		dog.place="kennel";
		dog.movement="walking"
		dog.displayDetails();
		dog.getInfo();
		dog.move();
		dog.eatFood();

	}

}
