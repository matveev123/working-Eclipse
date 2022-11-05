//ExreciseThree
package exercises.operators;

import static util.Print.*;

public class PassObject {
	static void f(Box x) {
		x.val = 12.44f;
	}

	public static void main(String[] args) {
		Box box = new Box();
		box.val = 5.5f;
		print("box.val = " + box.val);
		f(box);
		print("box.val = " + box.val);

	}

}

class Box {
	float val;
}