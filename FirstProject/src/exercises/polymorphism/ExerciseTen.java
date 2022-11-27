//ExerciseTen
package exercises.polymorphism;

import static util.Print.*;

public class ExerciseTen {

	public static void main(String[] args) {
		A a = new A();
		General g = new A();
		g.m1();
	}

}

class General {
	void m1() {
		print("method m1 from General");// 1
		m2();
	}

	void m2() {
		print("method m2 from General");
	}

}

class A extends General {
	void m2() {
		print("method m1 From class A");// 2
	}
}
