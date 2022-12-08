package exercises.innerclasses;

import static util.Print.*;

public class ExerciseEleven {
	private class Inner implements NotBlank {

		@Override
		public NotBlank v() {
			return new Inner();
		}

		NotBlank getNotBlank() {
			return (NotBlank) new Inner();
		}

		void doPrint() {
			print("do!");
		}
	}

	Inner getInner() {
		return new Inner();
	}

	void doPrintA() {
		print("do A!1!11!");
	}

	public static void main(String[] args) {
		ExerciseEleven ee = new ExerciseEleven();
		ee.getInner().v();
		//(Inner)(ee.getInner()).v();

	}

}
