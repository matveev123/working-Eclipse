//exercise5 and exercise6
package exercises.operators;

import static util.Print.*;

public class ExerciseFive {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		dog1.name = "scruffy";
		dog1.says = "Wurf!";
		dog2.name = "spot";
		dog2.says = "Ruff!";
		print(dog1.name + " says " + dog1.says);
		print(dog2.name + " says " + dog2.says);
		Dog dog3 = new Dog();
		dog1 = dog3;
		print("dog1 == dog3 " + (dog1 == dog3));// t
		print("dog2 == dog3 " + (dog2 == dog3));// f
		print("dog2 == dog1 " + (dog2 == dog1));// f
		print("dog1.equals(dog3)" + dog1.equals(dog3));// t
		print("dog1.equals(dog2)" + dog1.equals(dog2));// f
		print("dog1.equals(dog1)" + dog1.equals(dog1));// t
		print("dog2.equals(dog1)" + dog2.equals(dog1));// f
		print("dog2.equals(dog2)" + dog2.equals(dog2));// t
		print("dog2.equals(dog3)" + dog2.equals(dog3));// f
		print("dog3.equals(dog1)" + dog3.equals(dog1));// t
		print("dog3.equals(dog2)" + dog3.equals(dog2));// f
		print("dog3.equals(dog3)" + dog3.equals(dog3));// f
	}

}

class Dog {
	String says;
	String name;
	// private fields in class
	// getters
	// setters
	// void method speak
}
