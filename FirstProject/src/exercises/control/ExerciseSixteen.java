package exercises.control;

import static util.Print.print;

import java.util.Random;
import static util.Print.*;

public class ExerciseSixteen {
	static char comparison(int a, int b) {
		if (a > b)
			return '>';
		else if (a < b)
			return '<';
		else
			return '=';
	}

	public static void main(String[] args) {
		Random rand = new Random();
		Random rand1 = new Random();
		int i = 0;
		while (i == 0)
			print("randomly generated number = " + rand.nextInt(10) + " and it "
					+ comparison(rand.nextInt(10), rand1.nextInt(10)) + " then " + rand1.nextInt(10));

	}

}
