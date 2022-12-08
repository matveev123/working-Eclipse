//ExerciseSix
package exercises.innerclasses;

import static util.Print.*;

import exercises.innerclasses.another.Interface1;

public class Simple {
	protected class SimpleInner implements Interface1 {
		public SimpleInner() {
		}

		@Override
		public String i() {
			return "HI!";
		}
	}

	public static void main(String[] args) {

	}

}
