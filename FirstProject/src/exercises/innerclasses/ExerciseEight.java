package exercises.innerclasses;

import static util.Print.*;

public class ExerciseEight {
	class Little {
		private long l = 100l;

		private String check() {
			return "ok!";
		}
	}

	public static void main(String[] args) {
		print(new ExerciseEight().new Little().l + " and " + new ExerciseEight().new Little().check());

	}

}
