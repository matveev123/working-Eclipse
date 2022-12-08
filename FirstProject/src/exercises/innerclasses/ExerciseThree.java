//ExerciseThree
package exercises.innerclasses;

import static util.Print.*;

public class ExerciseThree {

	public static void main(String[] args) {
		Outer1.main(args);

	}

}

class Outer1 {
	private String line;

	Outer1(String line) {
		this.line = line;
	}

	public static void main(String[] args) {
		Outer1.Inner oi1 = new Outer1("HAHA!").new Inner();
		print(oi1);
	}

	class Inner {
		Inner getInner() {
			return new Inner().getInner();
		}

		public String toString() {
			return line;
		}
	}

}
