//ExerciseSixteen
package exercises.interfaces.ex16;

import static util.Print.*;

import java.util.Random;

public class RandomCharacter {
	private static Random rand = new Random();

	public int next() {
		return rand.nextInt(25) + 65;
	}

}
