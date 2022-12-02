package interfaces;

import static util.Print.*;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RandomWords implements Readable {
	private static Random rand = new Random(47);
	private static final char[] capitals = "ABCDEFGHI1KLMN0PQRSTUVWXYZ".toCharArray();
	private char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private char[] vowels = "aeiou".toCharArray();
	int count;

	public RandomWords(int count) {
		this.count = count;
	}

	public int read(CharBuffer cb) {
		if (count-- == 0)
			return -1;
		cb.append(capitals[rand.nextInt(capitals.length)]);
		for (int i = 0; i < 4; i++) {
			cb.append(lowers[rand.nextInt(lowers.length)]);
			cb.append(vowels[rand.nextInt(vowels.length)]);
		}
		cb.append(" ");
		return 99999;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(new RandomWords(10));//Scanner sc = new Scanner(Readable source);!!!
		while (sc.hasNext())
			print(sc.next());

	}

}
