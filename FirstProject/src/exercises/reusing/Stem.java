//ExerciseNine
package exercises.reusing;

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

	public static void main(String[] args) {
		Stem stem = new Stem(4);
		// System.out.println(stem.c1);
	}
}

class Component1 {
	Component1(int i) {
		System.out.println("Component1(int i)");
	}
}

class Component2 {
	Component2(int i) {
		System.out.println("Component2(int i)");
	}
}

class Component3 {
	Component3(int i) {
		System.out.println("Component3(int i)");
	}
}
