package exercises.interfaces;

import static util.Print.*;

public class ExerciseFour {
	private static void staticm(None n) {
		((Both) n).m();
	}

	private static void staticm2(None2 n2) {
		n2.m();// withous downcasting!
	}

	public static void main(String[] args) {
		Both both = new Both();
		staticm(both);
		Both2 both2 = new Both2();
		staticm2(both2);

	}

}

abstract class None {
}

class Both extends None {
	void m() {
		print("im here!");
	}
}

abstract class None2 {
	abstract void m();
}

class Both2 extends None2 {
	void m() {
		print("im relly here!");
	}
}
