//ExerciseFive
package exercises.polymorphism.bike;

import static util.Print.*;

class Cycle {
	private String name = "Cycle";
	private int numbWheels = 0;

	void go() {
		print(name + " ride" + " and has " + numbWheels + " wheels");
	}

	int wheels() {
		return numbWheels;
	}

	@Override
	public String toString() {
		return name;
	}

}

public class Go {
	public static void ride(Cycle c) {
		// print(c + " ride" + " and has " + c.numbWheels + " wheels");
		c.go();
	}

	public static void main(String[] args) {
		ride(new Cycle());
		ride(new Bycycle());
		ride(new Tricycle());
		ride(new Unicycle());
	}
}

class Unicycle extends Cycle {
	private String name = "Unicycle";
	private int numbWheels = 1;

	@Override
	public String toString() {
		return name;
	}

	@Override
	void go() {
		print(name + " ride" + " and has " + numbWheels + " wheels");
	}
}

class Bycycle extends Cycle {
	private String name = "Bicycle";
	private int numbWheels = 2;

	@Override
	public String toString() {
		return name;
	}

	@Override
	void go() {
		print(name + " ride" + " and has " + numbWheels + " wheels");
	}
}

class Tricycle extends Cycle {
	private String name = "Tricycle";
	private int numbWheels = 3;

	@Override
	public String toString() {
		return name;
	}

	@Override
	void go() {
		print(name + " ride" + " and has " + numbWheels + " wheels");
	}
}