//ExercoseSeven
package exercises.interfaces;

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

interface Rodent {

	void eat();

	void run();

	void sleep();

}

class Rat implements Rodent {
	private String name = "Rat";

	public void eat() {
		print("Rat.eat()");
	}

	public void run() {
		print("Rat.run()");
	}

	public void sleep() {
		print("Rat.sleep()");
	}

	@Override
	public String toString() {
		return name;
	}
}

class Hamster implements Rodent {
	private String name = "Hamster";

	public void eat() {
		print("Hamster.eat()");
	}

	public void run() {
		print("Hamster.run()");
	}

	public void sleep() {
		print("Hamster.sleep()");
	}

	@Override
	public String toString() {
		return name;
	}
}

class Mouse implements Rodent {
	private String name = "Mouse";

	public void eat() {
		print("Mouse.eat()");
	}

	public void run() {
		print("Mouse.run()");
	}

	public void sleep() {
		print("Mouse.sleep()");
	}

	@Override
	public String toString() {
		return name;
	}
}

class Squirell implements Rodent {
	private String name = "Squirell";

	public void eat() {
		print("Squirelleat()");
	}

	public void run() {
		print("Squirell.run()");
	}

	public void sleep() {
		print("Squirell.sleep()");
	}

	@Override
	public String toString() {
		return name;
	}
}
