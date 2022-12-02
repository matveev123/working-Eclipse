package exercises.interfaces;

import static util.Print.*;

import java.util.Random;

public class ExerciseNineteen {
	public static void play(TossingFactory fact) {
		Tossing t = fact.geTossing();
		t.move();

	}

	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			play(new CoinFacroty());
			play(new DiceFactory());
			println();
		}

	}

}

interface Tossing {
	void move();
}

interface TossingFactory {
	Tossing geTossing();
}

class Coin implements Tossing {
	Coin() {
	}

	private Random rand = new Random();

	@Override
	public void move() {
		boolean drop = rand.nextBoolean();
		if (drop)
			print("tails!");
		else
			print("heads!");
	}

}

class CoinFacroty implements TossingFactory {

	@Override
	public Tossing geTossing() {
		return new Coin();
	}
}

class Dice implements Tossing {
	Dice() {
	}

	private Random rand = new Random();

	@Override
	public void move() {
		print("first dice: " + (rand.nextInt(4) + 2) + "\nsecond dice: " + (rand.nextInt(4) + 2));
	}
}

class DiceFactory implements TossingFactory {

	@Override
	public Tossing geTossing() {
		return new Dice();
	}

}
