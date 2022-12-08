package exercises.innerclasses;

import static util.Print.*;

import exercises.control.VampireNumbers;

//DangerousMonster and Vampire - anonymous classes

interface Intrfc1 {
	void o();
}

interface Intrfc extends Intrfc1 {// another version
	void v();
}

public class ExerciseFourteen {
	public static void show(Intrfc i) {
		i.o();
		i.v();

	}

	Intrfc monsterMaker() {// another version
		return new Intrfc() {

			@Override
			public void o() {
			}

			@Override
			public void v() {
			}

		};
	}

	public static void main(String[] args) {
		// another version:
		ExerciseFourteen ef = new ExerciseFourteen();
		ef.show(ef.monsterMaker());
		ef.show(ef.monsterMaker());
		//////////////////////////////////////////////
		DradgonZilla barney = new DradgonZilla();
		barney.dangerousMonster().menace();
		// barney.dangerousMonster().menace();
		barney.dangerousMonster().destroy();
		VeryBadVampire vlad = new VeryBadVampire();
		vlad.vampire().menace();
		// vlad.vampire().menace();
		vlad.vampire().destroy();
		vlad.vampire().kill();
		vlad.vampire().drinkBlood();

	}

}

class DradgonZilla {
	interface Monster {
		void menace();
	}

	abstract class DangerousMonster implements Monster {
		public abstract void destroy();

		public abstract void menace();
	}

	DangerousMonster dangerousMonster() {// dangerousMonster
		return new DangerousMonster() {

			@Override
			public void destroy() {
			}

			@Override
			public void menace() {
			}

		};
	}
}

class VeryBadVampire {
	interface Monster {
		void menace();
	}

	interface Lethal {

		void kill();
	}

	abstract class Vampire implements Monster, Lethal {
		public abstract void destroy();

		public abstract void menace();

		public abstract void kill();

		public abstract void drinkBlood();
	}

	Vampire vampire() {
		return new Vampire() {

			@Override
			public void destroy() {
			}

			@Override
			public void menace() {
			}

			@Override
			public void kill() {
			}

			@Override
			public void drinkBlood() {
			}

		};
	}

}
