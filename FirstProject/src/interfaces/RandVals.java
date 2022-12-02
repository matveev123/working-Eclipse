package interfaces;

import static util.Print.*;

import java.util.Random;

public class RandVals {
	public static void main(String[] args) {
		print(O.RANDOM_BOOLEAN);
		print(O.RANDOM_DOUBLE);
		print(O.RANDOM_FLOAT);
		print(O.RANDOM_INT);

	}

}

interface O {
	Random random = new Random(47);
	int RANDOM_INT = random.nextInt(47);
	double RANDOM_DOUBLE = random.nextDouble() * 10;
	long RANDOM_lONG = random.nextLong() * 10;
	float RANDOM_FLOAT = random.nextFloat() * 10;
	boolean RANDOM_BOOLEAN = random.nextBoolean();
}
