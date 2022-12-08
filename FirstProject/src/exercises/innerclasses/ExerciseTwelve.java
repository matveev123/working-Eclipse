package exercises.innerclasses;

import static util.Print.*;

interface Inner {
	void modify();
}
// or
//abstract class Inner {
//public abstract void modify();
//}

public class ExerciseTwelve {
	private int valI = 20;

	public void hi() {
		print("hi!");
	}

	public void showI() {
		print(valI);
	}

	public Inner getInner() {
		return new Inner() {
			public void modify() {
				valI *= 2;
				hi();
			}
		};
	}

	static void testInner(ExerciseTwelve et) {
		Inner inner = et.getInner();
		inner.modify();
	}

	public static void main(String[] args) {
		ExerciseTwelve et = new ExerciseTwelve();
		et.showI();
//		testInner(et);
		// or et.testInner(et); without static!
		et.getInner().modify();
		et.showI();
	}

}
