package exercises.innerclasses;

import static util.Print.*;

public class ExerciseOne1 {

	public static void main(String[] args) {
		Outer.main(args);

	}

}

class Outer {
	public static void main(String[] args) {
		Outer.Inner oi = new Outer().new Inner();
		Outer.Inner oi2 = m3();
		Outer.Inner oi3 = new Outer().m();

	}

	class Inner {
		Inner getInner() {
			return new Inner().getInner();
		}
	}

	Inner m() {
		Outer o = new Outer();
		Outer.Inner io = new Inner();
		return new Outer().new Inner().getInner();
	}

	Inner m2() {
		return new Inner();
	}

	static Inner m3() {
		Outer o = new Outer();
		Outer.Inner io = o.new Inner();
		return new Outer().new Inner().getInner();
	}
}
