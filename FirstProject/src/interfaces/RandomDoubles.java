package interfaces;

import static util.Print.*;

import java.util.Random;

public class RandomDoubles {
	private static Random rand = new Random(47);

	public double next() {
		return rand.nextDouble();
	}

//	public static void main(String[] args) {
//		RandomDoubles rD = new RandomDoubles();
//		for (int i = 0; i < 7; i++)
//			print(rD.next() + " ");
//	}

}
