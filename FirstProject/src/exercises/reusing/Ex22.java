package exercises.reusing;

import static util.Print.*;

public class Ex22 { // extends FinalClass {//error

	public static void main(String[] args) {
		FinalClass finalClass = new FinalClass();
		finalClass.f();
	}

}

final class FinalClass {
	void f() {
		print("mehod f() from final class");
	}
}
