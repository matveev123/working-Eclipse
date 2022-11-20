//ExerciseFive
package exercises.reusing;

public class C extends A {
	B b = new B();//second call A() and call B()
	int i ;

	public static void main(String[] args) {
		C c = new C();// first call A();
	}

}

class B extends A {
	B() {
		System.out.println("B()");
	};
}

class A {
	A() {
		System.out.println("A()");
	}
}

