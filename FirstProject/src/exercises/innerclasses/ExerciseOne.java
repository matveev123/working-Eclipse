package exercises.innerclasses;

import static util.Print.*;

public class ExerciseOne {

	public static void main(String[] args) {
		A.B x = new A().new B();
		print(x);
	}

}

class A {
	class B {
	}
}
