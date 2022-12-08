package exercises.innerclasses;

import static util.Print.*;

public class ExerciseNine {
	private NotBlank g() {
		class Implementation implements NotBlank {
			public NotBlank v() {
				print("type NotBlank returned!");
				return new Implementation();
			}

		}
		return new Implementation();
	}

//	public static void test(NotBlank nb) {
//		nb.v();
//	}

	public static void main(String[] args) {
		print(new ExerciseNine().g().v());
		print(new ExerciseNine().g());

	}

}
