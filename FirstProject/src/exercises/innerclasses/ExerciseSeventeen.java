package exercises.innerclasses;

import static util.Print.*;

import java.util.Random;

public class ExerciseSeventeen {

	public static void play(TossingFcatory fact) {
		Tossing t = fact.getTossing();
		t.move();
	}

	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			play(Coin.factory);
			play(Dice.factory);
			println();
		}

	}

}

interface Tossing {
	void move();
}

interface TossingFcatory {
	Tossing getTossing();
}

class Coin implements Tossing {
	private Random rand = new Random();

	@Override
	public void move() {
		boolean drop = rand.nextBoolean();
		if (drop)
			print("tails!");
		else
			print("heads!");
	}

	public static TossingFcatory factory = new TossingFcatory() {
		public Tossing getTossing() {
			return new Coin();
		}
	};
}

class Dice implements Tossing {
	private Random rand = new Random();

	@Override
	public void move() {
		print("first dice: " + (rand.nextInt(4) + 2) + "\nsecond dice: " + (rand.nextInt(4) + 2));
	}

	public static TossingFcatory factory = new TossingFcatory() {
		public Tossing getTossing() {
			return new Dice();
		}
	};

}
