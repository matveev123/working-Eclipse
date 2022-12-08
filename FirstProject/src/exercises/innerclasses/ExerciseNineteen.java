package exercises.innerclasses;

import static util.Print.*;

interface Interfac {
	void v();
}

public class ExerciseNineteen {

	public static class A {

		public static class B {
			public static String name = "name";
			public String name1 = "name";

			public static class C {
				public static String x = "name";
				public String x1 = "name";
			}
		}
	}

	public static void main(String[] args) {
		ExerciseNineteen.A aa = new ExerciseNineteen.A();
		ExerciseNineteen.A.B eab = new ExerciseNineteen.A.B();
		ExerciseNineteen.A.B x;

		ExerciseNineteen.A.B.C eabc = new ExerciseNineteen.A.B.C();

	}

}
