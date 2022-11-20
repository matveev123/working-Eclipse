//ExerciseSeven
package exercises.reusing;

public class C1 extends A1 {
	B1 b1 = new B1(6);// second call A() and call B()
	int i;

	public C1(int i) {
		super(i);
	}

	public static void main(String[] args) {
		C1 c1 = new C1(6);// first call A();
	}

}

class B1 extends A1 {
	B1(int i) {
		super(i);
	};
}

class A1 {
	A1(int i) {
	}
}
