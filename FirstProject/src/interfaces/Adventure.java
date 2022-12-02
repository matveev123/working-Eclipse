//ExerciseTwelve
package interfaces;

import static util.Print.*;

public class Adventure {
	public static void t(CanSwim x) {
		x.swim();
	}

	public static void m(CanFly x) {
		x.fly();
	}

	public static void f(CanFight x) {
		x.fight();
	}

	public static void g(ActionCharacter x) {
		x.fight();
	}

	public static void o(CanClimb x) {
		x.climb();
	}

	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);
		m(h);
		f(h);
		g(h);
		o(h);
	}

}

interface CanClimb {
	void climb();
}

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

interface CanFight {
	void fight();
}

class ActionCharacter {
	public void fight() {
	};
}

class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim, CanClimb {

	@Override
	public void swim() {
	}

	@Override
	public void fly() {
	}

	@Override
	public void climb() {
	}

}
