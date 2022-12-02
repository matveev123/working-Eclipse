package exercises.interfaces;

public class ExerciseThree {

	public static void main(String[] args) {
		/*
		 * Process of initialization: 1. Storage for I s allocated and initialized to
		 * binary zero 2. General() called 3. I.print() called in General() (I.i = 0) 4.
		 * Member initializers called in order (I.i = 47) 5. Body of I() called
		 */
		I i = new I();
		System.err.println("\n");
		i.print();
	}

}

abstract class General {
	General() {
		print();// from class I
	}

	abstract void print();
}

class I extends General {
	private int i = 47;

	void print() {
		System.out.print("I.i = " + i);
	}
}