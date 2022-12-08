package exercises.innerclasses;

import static util.Print.*;

public class BigEgg extends Egg {

	public class Yolk {// ()
		public Yolk() {
			print("BigEgg.Yolk()");
		}
	}

	public static void main(String[] args) {
		new BigEgg();

	}

}

class Egg {
	public Egg() {
		print("New Egg();");// 1
		y = new Yolk();
	}

	private Yolk y;

	protected class Yolk {// ()
		public Yolk() {
			print("Egg.Yolk()");// 2
		}
	}
}
