package exercises.polymorphism;

import static util.Print.*;

import java.util.Random;

public class ExerciseNine {
	static RandomRodentGenerator gen = new RandomRodentGenerator();

	public static void main(String[] args) {
		Rodent[] rodents = new Rodent[4];
		for (int i = 0; i < rodents.length; i++) {
			rodents[i] = gen.next();
			rodents[i].eat();
			rodents[i].run();
			rodents[i].sleep();
		}

	}

}

class RandomRodentGenerator {
	private Random rand = new Random();

	public Rodent next() {
		switch (rand.nextInt(4)) {
		default:
		case 0:
			return new Rat();
		case 1:
			return new Squirell();
		case 2:
			return new Mouse();
		case 3:
			return new Hamster();
		}

	}
}

class Rodent {
	private String name = "Rodent";

	void eat() {
		print("Rodent.eat()");
	}

	void run() {
		print("Rodent.run()");
	}

	void sleep() {
		print("Rodent.sleep()");
	}

	@Override
	public String toString() {
		return name;
	}
}

class Rat extends Rodent {
	private String name = "Rat";

	void eat() {
		print("Rat.eat()");
	}

	void run() {
		print("Rat.run()");
	}

	void sleep() {
		print("Rat.sleep()");
	}
}

class Hamster extends Rodent {
	private String name = "Hamster";

	void eat() {
		print("Hamster.eat()");
	}

	void run() {
		print("Hamster.run()");
	}

	void sleep() {
		print("Hamster.sleep()");
	}
}

class Mouse extends Rodent {
	private String name = "Mouse";

	void eat() {
		print("Mouse.eat()");
	}

	void run() {
		print("Mouse.run()");
	}

	void sleep() {
		print("Mouse.sleep()");
	}
}

class Squirell extends Rodent {
	private String name = "Squirell";

	void eat() {
		print("Squirelleat()");
	}

	void run() {
		print("Squirell.run()");
	}

	void sleep() {
		print("Squirell.sleep()");
	}
}
