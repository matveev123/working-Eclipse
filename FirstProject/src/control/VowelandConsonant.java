package control;

import static util.Print.*;

import java.util.Random;

public class VowelandConsonant {

	public static void main(String[] args) {
		Random rand = new Random(47);
		for (int i = 0; i < 10; i++) {
			int c = rand.nextInt(26) + 97;// 'a'
			printb((char) c + " :");
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case '0':
			case 'u':
				printb("vowel");
				break;
			case 'y':
			case 'w':
				printb("sometimes is a vowel");
				break;
			default:
				printb("consonant");
			}
			println();
		}
		// print((int)'a');

	}

}
