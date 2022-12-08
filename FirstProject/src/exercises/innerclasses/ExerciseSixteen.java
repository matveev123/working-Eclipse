package exercises.innerclasses;

import static util.Print.*;

public class ExerciseSixteen {

	public static void travel(CycleFactory fact) {
		Cycle c = fact.getCycle();
		c.ride();
	}

	public static void main(String[] args) {
		travel(Unicycle.factory);
		travel(Bycycle.factory);
		travel(Tricycle.factory);

	}

}

interface Cycle {
	void ride();
}

interface CycleFactory {
	Cycle getCycle();
}

class Unicycle implements Cycle {

	@Override
	public void ride() {
		print("Unicycle ride");
	}

	public static CycleFactory factory = new CycleFactory() {
		public Cycle getCycle() {
			return new Unicycle();
		}
	};
}

class Bycycle implements Cycle {

	@Override
	public void ride() {
		print("Bycycle ride");
	}

	public static CycleFactory factory = new CycleFactory() {
		public Cycle getCycle() {
			return new Bycycle();
		}
	};
}

class Tricycle implements Cycle {
	public void ride() {
		print("Tricycle ride");
	}

	public static CycleFactory factory = new CycleFactory() {
		public Cycle getCycle() {
			return new Tricycle();
		}
	};
}