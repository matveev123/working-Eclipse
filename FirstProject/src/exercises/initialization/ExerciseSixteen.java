package exercises.initialization;

import static util.Print.*;

import java.util.Arrays;
import java.util.Random;

public class ExerciseSixteen {

	public static void main(String[] args) {
		Random rand = new Random(47);
		String[] arrStr = new String[10];
		for (int i = 0; i < arrStr.length; i++)
			arrStr[i] = Integer.toString(rand.nextInt(10));
		print(Arrays.toString(arrStr));
	}

}
