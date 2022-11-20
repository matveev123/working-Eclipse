
package exercises.reusing;

import static util.Print.*;

import javax.lang.model.element.NestingKind;

/*
 * class Example { private int f = 5; protected int g;
 * 
 * Example() { print("f = " + f + " g = " + g); g = 33; }
 * 
 * private static int a = initVal("static Example.a initialized");
 * 
 * static int initVal(String s) { print(s); return 89; }
 * 
 * }
 * 
 * public class Ex23 extends Example { private int l =
 * initVal("Ex23.l initialized");
 * 
 * public Ex23() { print("l = " + l + "\nj = " + g); }
 * 
 * private static int e = initVal("Ex23.e inintialazed");
 * 
 * public static void main(String[] args) { print("Constructor Ex23"); Ex23 ex23
 * = new Ex23(); }
 * 
 * }
 */

class F {
	static int f = init("F.f initialized");

	static int init(String s) {
		print(s);
		return 1;
	}

	F() {
		print("Construcor F()");
	}
}

class L extends F {
	static int l = init("L.l initialized");

	L() {
		print("Construcor L()");
	}
}

class X {
	static int x = init("x.x initialized");
	F f = new F();

	static int init(String s) {
		print(s);
		return 1;
	}

	X() {
		print("Construcor x()");
	}
}

class D {
	D() {
		print("D() constructor");
	}
}

public class Ex23 extends L {
	static int i = init("Ex23.i initialized");

	public Ex23() {
		print("Constructor E23()");
	}

	public static void main(String[] args) {
		print("hi");

		Ex23 ex23 = new Ex23();
		print(X.x);
		D d = new D();
	}
}