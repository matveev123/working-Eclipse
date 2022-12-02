package exercises.interfaces;

import static util.Print.*;

public class ExerciseSeventeen {

	public static void main(String[] args) {
		print(J.d);// after adding '++' code makes Compile error!
		// using syntax J.d OK!
		// d - public static final
	}

}

interface J {
	double d = 10.1d;

}
