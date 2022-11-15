package exercises.initialization;

import static util.Print.*;

public class ExerciseOne {
	String line = "line";
	int n;
	String nullString;

	ExerciseOne(int init) {
		// this.n = n;
		n = init;

	}

	public ExerciseOne() {
	}

	public static void main(String[] args) {
		print((new ExerciseOne(1)).line);
		print((new ExerciseOne(1)).n);
		print((new ExerciseOne(1)).nullString);
		print(new ExerciseOne());
		print(new AnotherClass(0));
	}

}

class AnotherClass {
	int i;
	public AnotherClass(int i) {
		this.i = i;
	}
}
