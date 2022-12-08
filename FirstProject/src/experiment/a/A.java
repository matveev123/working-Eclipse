package experiment.a;

import static util.Print.*;

public class A {

	class C implements B {

	}

	B getB() {
		return new B() {
		};
	}

	B getB2() {
		return new B() {
		};
	}

	public static void main(String[] args) {
		print("123");

	}

}

//A.class
//A$B.class
//A$B$C.class
//A$B$C$D.class

//A.class
//B.class
//A$C.class
//A$1.class
//A$2.class

interface B {
}
