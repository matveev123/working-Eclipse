package exercises.control;

import static util.Print.*;

public class Test2 {
	static void binaryPrint(int q) {
		if (q == 0)
			System.out.print(0);
		else {
			int nlz = Integer.numberOfLeadingZeros(q);
			int g = 0;
			for (int k = 0; k < nlz; k++) {
				g = (q <<= 1);
				print(Integer.toBinaryString(g));
			}
			println();
			// q <<=nlz;
			for (int p = 0; p < 32 - nlz; p++) {

				int n = (Integer.numberOfLeadingZeros(q) == 0) ? 1 : 0;
				print(Integer.numberOfLeadingZeros(q));
				// System.out.print(n);
				g = (q <<= 1);

				print(Integer.toBinaryString(g));

			}
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		int i = 85;
		// print(Integer.toBinaryString(i));
		// print("manually:");
		// binaryPrint(i);
		////////////////////////////
		// print(Integer.toBinaryString(170));
		// print(Integer.toBinaryString(340));
//		System.out.println(Integer.toBinaryString((int)((byte)100)));
//		System.out.println(Integer.toBinaryString(100));
//		int foreach = 100;
//		print(foreach);
//		for (char c : "An African swallow!".toCharArray())
//			printb(c + " ");
		print((1234 % 1000) % 100);

	}

}
