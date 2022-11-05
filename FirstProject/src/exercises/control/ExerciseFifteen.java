package exercises.control;

import java.util.Random;
import java.util.PrimitiveIterator.OfDouble;

import static util.Print.*;

public class ExerciseFifteen {
	static char comparison(int a, int b) {
		if (a > b)
			return '>';
		else if (a < b)
			return '<';
		else
			return '=';
	}

	public static void main(String[] args) {
		for (int i = 0; i != 101; i++)
			System.out.println("i = " + i);
		Random rand = new Random();
		Random rand1 = new Random();

		for (int i = 0; i <= 26; i++)
			print("randomly generated number = " + rand.nextInt(10) + " and it "
					+ comparison(rand.nextInt(10), rand1.nextInt(10)) + " then " + rand1.nextInt(10));

	}

}
