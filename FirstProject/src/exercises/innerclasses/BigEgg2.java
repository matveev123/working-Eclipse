package exercises.innerclasses;

import static util.Print.*;

class Egg2 {

	protected class Yolk {
		public Yolk() {// 1 е
			print("Egg2.Yolk()");
		}

		public void f() {
			print("Egg2.Yolk.f()");
		}
	}

	private Yolk y1 = new Yolk();
	private Yolk y2 = new Yolk();

	public Egg2() {// 2
		print("new Egg2()");
	}

	public void insertYolk(Yolk yy) {// y( from Egg2) = yy( from BiEgg2)
		y2 = yy;
		// конце концов y из BigEeg2!
	}

	public void g() {
		y1.f();
	}

}

public class BigEgg2 extends Egg2 {

	public class Yolk extends Egg2.Yolk {
		public Yolk() {
			print("BigEgg2.Yolk()");
		}

		public void f() {// overrided
			print("BigEgg2.Yolk.f()");
		}

	}

	public BigEgg2() {
		insertYolk(new Yolk());// BigEgg2.Yolk() + Egg2.Yolk()
	}

	public static void main(String[] args) {
		Egg2 e2 = new BigEgg2();
		print("space!!");
		e2.g();

	}

}
