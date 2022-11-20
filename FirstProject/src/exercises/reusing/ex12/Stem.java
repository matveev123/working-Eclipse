//ExerciseTwelve
package exercises.reusing.ex12;

class Root {
	Component1 c1;
	Component2 c2;
	Component3 c3;

	Root(int i) {
		System.out.println("Root(int i)");
		c1 = new Component1(i);
		c2 = new Component2(i);
		c3 = new Component3(i);
	}

	void dispose() {

		c3.dispose();
		c2.dispose();
		c1.dispose();
		System.out.println("dispose Root:");
	}

}

public class Stem extends Root {
	Component1 c1S;
	Component2 c2S;
	Component3 c3S;

	public Stem(int i) {
		super(i);
		System.out.println("Stem(int i)");
		c1S = new Component1(i);
		c2S = new Component2(i);
		c3S = new Component3(i);

	}

	void dispose() {
		c3S.dispose();
		c2S.dispose();
		c1S.dispose();
		super.dispose();
		System.out.println("dispose Stem");
	}

	public static void main(String[] args) {
		Stem stem = new Stem(4);
		try {
			// code and exception handling...
		} finally {
			stem.dispose();
		}
	}
}

class Component1 {
	Component1(int i) {
		System.out.println("Component1(int i)");
	}

	void dispose() {
		System.out.println("dispose Component1");
	}

}

class Component2 {
	Component2(int i) {
		System.out.println("Component2(int i)");
	}

	void dispose() {
		System.out.println("dispose Component2");
	}
}

class Component3 {
	Component3(int i) {
		System.out.println("Component3(int i)");
	}

	void dispose() {
		System.out.println("dispose Component3");
	}
}
