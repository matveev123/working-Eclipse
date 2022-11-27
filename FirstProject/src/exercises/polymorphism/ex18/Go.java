//ExerciseEightteen
package exercises.polymorphism.ex18;

import static util.Print.*;

class Cycle {
//	void balance() {
//		print("OK!/");
//	}
}

public class Go {

	public static void main(String[] args) {

		Cycle[] x = { new Unicycle(), new Bycycle(), new Tricycle() };// upcasting!
		// compoile time error method balance undefined
//		x[0].balance();
//		x[1].balance();
//		x[2].balance();
		((Unicycle) x[0]).balance();// ok
		((Bycycle) x[1]).balance();// ok
		// compile time error
//		(Triucycle)(x[2]).balance();

	}

}

class Unicycle extends Cycle {
	void balance() {
		print("hard,relly!");
	}
}

class Bycycle extends Cycle {
	void balance() {
		print("very easy to balance");
	}
}

class Tricycle extends Cycle {
}