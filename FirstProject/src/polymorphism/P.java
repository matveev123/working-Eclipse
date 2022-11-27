package polymorphism;

import static util.Print.*;

public class P {

	public static void main(String[] args) {
		new Q();
	}

}

class M {
	M() {
		ok();
	}

	private void ok() {
		print("OK!");
	};
}

class Q extends M {
	Q() {
		ok();
	}

	void ok() {
		print("JEY!");

	}
}
