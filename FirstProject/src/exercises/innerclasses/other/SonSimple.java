//ExerciseSix
package exercises.innerclasses.other;

import static util.Print.*;

import exercises.innerclasses.Simple;

public class SonSimple extends Simple {
	SimpleInner m() {
		return new SimpleInner();
	}

	public static void main(String[] args) {
		print(new SonSimple().m().i());
	}
}
