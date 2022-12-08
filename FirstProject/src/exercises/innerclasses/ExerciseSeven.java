package exercises.innerclasses;

import static util.Print.*;


public class ExerciseSeven {
	private int i = 1;

	private void hi() {
		print("hi!");
	}

	class Inner {
		void modify() {
			i *= 2;
			hi();
		}
	}

	public void showI() {
		print(i);
	}

	void testInner() {
		Inner inner = new Inner();
		inner.modify();
	}

	public static void main(String[] args) {
		ExerciseSeven es = new ExerciseSeven();
		es.showI();
		es.testInner();
		es.showI();
	}

}
