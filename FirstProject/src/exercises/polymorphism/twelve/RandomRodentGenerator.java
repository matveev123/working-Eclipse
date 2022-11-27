package exercises.polymorphism.twelve;

import static util.Print.*;

import java.util.Random;

public class RandomRodentGenerator {
	private Random rand = new Random();
	protected Shared shared;

	public Rodent next() {
		switch (rand.nextInt(4)) {
		default:
		case 0:
			return new Rat(shared);
		case 1:
			return new Squirell(shared);
		case 2:
			return new Mouse(shared);
		case 3:
			return new Hamster(shared);
		}

	}
}
