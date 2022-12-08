package exercises.innerclasses;

import static util.Print.*;

public class ExerciseTwemtySix {

	public static void main(String[] args) {

		M m = new M();
		M.B mb = new M().new B("man");
		M2.BInherit m2bI = new M2().new BInherit(m);

	}

}

class M {
	class B {
		private String str;

		B(String str) {
			this.str = str;
		}

	}
}

class M2 {

	class BInherit extends M.B {
		public String str2 = "line";

		BInherit(M m) {
			m.super(new BInherit(m).str2);

		}
	}
}
