package exercises.initialization;

import static util.Print.*;

import java.util.Random;

public class ExerciseTwentyOne {

	public static void main(String[] args) {
		for (Currency b : Currency.values())
			print(b + " , ordinal " + b.ordinal());
		for (Currency b : Currency.values())
			switch (b) {
			case ONE: {
				System.out.println("1$");
				break;
			}
			case FIVE: {
				System.out.println("5$");
				break;
			}
			case TEN: {
				System.out.println("10$");
				break;
			}
			case TWENTY: {
				System.out.println("20$");
				break;
			}
			case FIFTY: {
				System.out.println("50$");
				break;
			}
			case HUNDRED: {
				System.out.println("100$");
				break;
			}
			}
		print(Currency.valueOf("ONE"));

	}

}

enum Currency {
	ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
}
