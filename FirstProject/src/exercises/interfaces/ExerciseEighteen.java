package exercises.interfaces;

import static util.Print.*;

public class ExerciseEighteen {
	public static void factories(CycleFactory fact) {
		Cycle c = fact.getCycle();
		c.move();
	}

	public static void main(String[] args) {
		factories(new UnicycleFactory());
		factories(new BycycleFactory());
		factories(new TricycleFactory());
	}

}

interface Cycle {
	void move();
}

interface CycleFactory {
	Cycle getCycle();
}

class UnicycleFactory implements CycleFactory {
	@Override
	public Cycle getCycle() {
		return new Unicycle();
	}

}

class Unicycle implements Cycle {
	Unicycle() {
	}

	@Override
	public void move() {
		print("move Unicycle");
	}

}

class BycycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		return new Bycycle();
	}

}

class Bycycle implements Cycle {
	Bycycle() {
	}

	@Override
	public void move() {
		print("move Bycycle");
	}

}

class TricycleFactory implements CycleFactory {

	@Override
	public Cycle getCycle() {
		return new Tricycle();
	}

}

class Tricycle implements Cycle {
	Tricycle() {
	}

	@Override
	public void move() {
		print("move Tricycle");
	}
}
