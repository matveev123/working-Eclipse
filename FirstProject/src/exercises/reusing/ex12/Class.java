
package exercises.reusing.ex12;

import static util.Print.*;

public class Class {
	protected void method() {
		System.out.println("protected method");
	}

	public static void main(String[] args) {
		F.main(args);
	}

}

class F extends Class {
	public static void main(String[] args) {
		new F().method();
	}
}
