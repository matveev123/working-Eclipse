//ExerciseOne
package exercises.polymorphism.music;

import static util.Print.*;

class Cycle {
	void go() {
		print("Cycle ride");
	}

}

public class Go {
	public static void ride(Cycle c) {
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
	void go() {
		print("Unicycle ride");
	}
}

class Bycycle extends Cycle {
	void go() {
		print("Bycycle ride");
	}
}

class Tricycle extends Cycle {
	void go() {
		print("Tricylce ride");
	}
}