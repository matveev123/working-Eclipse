package exercises.operators;

import static util.Print.*;

import java.util.Random;

// heads and tails
public class ExerciseSeven {
	static void flip() {
		Random rand = new Random();
		if (rand.nextInt(2) == 0) // int i =rand.nextInt()!!!
			print("heads"); // if (i % 2 == 0)
		else
			print("tails");
	}

	public static void main(String[] args) {
		// Random rand = new Random(n)+x; n -верхняя граница(по умолчанию - зависимость
		// от текущего времени,если + не укзан параметр); контроль значения нижний
		// границы(по умолчанию 0)
		flip();

	}

}

class Coin {
}
