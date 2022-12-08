package exercises.innerclasses;

import static util.Print.*;

public class ExerciseSix {

	public static void main(String[] args) {
		H h = new H();
		print("before InnerH.change() H.i = " + h.method());
		h.ex();
		print("after InnerH.change() H.i = " + h.method());
	}

}

class H {
	private int i = 20;

	String method() {
		return Integer.toString(i);
	}

	void ex() {
		new InnerH().change();
	}

	class InnerH {
		void change() {
			i = 100;
			method();
		}
	}
}
