package exercises.control;

import static util.Print.*;

public class ExerciseNineteen {
	static void binaryPrint(int q) {
		if (q == 0)
			printb("0");
		else {
			int nlz = Integer.numberOfLeadingZeros(q);
			q <<= nlz;
			for (int k = 0; k < 32 - nlz; k++) {
				int n = (Integer.numberOfLeadingZeros(q) == 0) ? 1 : 0;
				printb(n);
				q <<= 1;
			}
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		int c1 = 85;
		int c2 = 170;
		print("ExerciseTen using Integer.toBinaryString():");
		binaryPrint(c1);
		binaryPrint(c2);
		binaryPrint(c1 & c2);
		binaryPrint(c1 | c2);
		binaryPrint(c1 ^ c2);
		binaryPrint(~c2);
		binaryPrint(~c1);
	}

}
