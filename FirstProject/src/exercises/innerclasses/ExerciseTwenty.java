package exercises.innerclasses;

import static util.Print.*;

// exercises.interfaces.Test
// exercises.interfaces.ExerciseTwenty$Temp
public interface ExerciseTwenty {
	void m();

	class Temp implements ExerciseTwenty {

		public static void main(String[] args) {
			Temp temp = new Temp();
			temp.m();
		}

		public void t() {
			print("t()");
		}

		@Override
		public void m() {
			print("from nested class!");
		}
	}
}

class Test implements ExerciseTwenty {
	public static void main(String[] args) {
		ExerciseTwenty.Temp in = new ExerciseTwenty.Temp();
		in.t();
	}

	@Override
	public void m() {
		print("from separet class Test!");
	}
}
