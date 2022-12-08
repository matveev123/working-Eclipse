package innerclasses;

import static util.Print.*;

public class MultiInterfaces {
	public static void takesA(A a) {
	}

	public static void takesB(B b) {
	}

	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		takesA(x);
		takesA(y);
		takesB(x);
		takesB(y.makeB());

	}

}

interface A {
}

interface B {
}

class X implements A, B {

}

class Y implements A {
	B makeB() {
		return new B() {
		};
	}
}