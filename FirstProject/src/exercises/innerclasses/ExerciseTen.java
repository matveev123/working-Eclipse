package exercises.innerclasses;

import static util.Print.*;

public class ExerciseTen {
	private NotBlank extraction(boolean b) {
		if (b) {
			class Imp implements NotBlank {

				@Override
				public NotBlank v() {
					print("type NotBlank returned!");
					return new Imp();
				}

			}
			return new Imp();
		}
		return null;

	}

	public static void main(String[] args) {
		System.out.println(new ExerciseTen().extraction(true).v());
	}

}
