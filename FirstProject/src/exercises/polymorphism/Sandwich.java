//ExerciseEleven
package exercises.polymorphism;

import static util.Print.*;

public class Sandwich extends PortableLunch {

	Bread b = new Bread();
	Chesee c = new Chesee();
	Lettuce l = new Lettuce();
	Pickle p = new Pickle();

	public Sandwich() {
		print("Sancwich()");
	}

	public static void main(String[] args) {
		new Sandwich();

	}

}

class Pickle {
	Pickle() {
		print("Pickle()");
	}
}

class Meal {
	public Meal() {
		print("Meal()");
	}
}

class Lettuce {
	public Lettuce() {
		print("Lettuce()");
	}
}

class Bread {
	public Bread() {
		print("Bread()");
	}
}

class Chesee {
	public Chesee() {
		print("Cheeese()");
	}
}

class Lunch extends Meal {
	public Lunch() {
		print("Lunch()");
	}
}

class PortableLunch extends Lunch {
	PortableLunch() {
		print("PortableLunch()");
	}
}
