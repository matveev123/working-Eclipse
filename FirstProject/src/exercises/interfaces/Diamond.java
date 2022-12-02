//ExerciseThirteen
package exercises.interfaces;

import static util.Print.*;

public class Diamond {

	public static void main(String[] args) {
		Do do1 = new Do();
		do1.a();
		do1.b();
		do1.c();
		do1.r();

	}

}

interface B {
	void b();
}

interface R extends B {
	void r();
}

interface C extends B {
	void c();

}

interface A extends R, C {
	void a();
}

class Do implements A {

	@Override
	public void r() {
	}

	@Override
	public void b() {
	}

	@Override
	public void c() {
	}

	@Override
	public void a() {
	}
}
