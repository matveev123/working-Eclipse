//ExerciseEight
package exercises.interfaces;

import static util.Print.*;

interface FastFood {
	void fries();

	void cheeseburger();

	void softDrink();
}

public class Sandwich extends PortableLunch implements FastFood {

	Bread b = new Bread();
	Chesee c = new Chesee();
	Lettuce l = new Lettuce();
	Pickle p = new Pickle();

	public void softDrink() {
		print("softDrink()");
	}

	public void cheeseburger() {
		print("cheeseburger");
	}

	public void fries() {
		print("fries");
	}

	public Sandwich() {
		print("Sancwich()");
	}

	public static void main(String[] args) {
		Sandwich s = new Sandwich();
		s.cheeseburger();
		s.fries();
		s.softDrink();

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
