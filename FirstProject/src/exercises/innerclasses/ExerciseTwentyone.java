package exercises.innerclasses;

import static util.Print.*;

public class ExerciseTwentyone {
	public static void main(String[] args) {
		Trololo.Man.main(args);
	}

}
//exercises.innerclasses.ExerciseTwentyone$Man
//exercises.interfaces.Test

interface Trololo {
	void lolo();

	class Man implements Trololo {

		public static void method(Trololo t) {
			t.lolo();
			print("and");
			new Man().lolo();
		}

		Trololo abc() {
			return new Trololo() {

				@Override
				public void lolo() {
					print("from anonymous class1");
				}

			};
		}

		public static void main(String[] args) {
			method(new Man().abc());
		}

		@Override
		public void lolo() {
			print("from nested class in interface");
		}
	}
}
