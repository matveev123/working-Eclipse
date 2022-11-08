package exercises.operators;

import static util.Print.*;

public class ExerciseTen {

	public static void main(String[] args) {
		// ! | & ^
		int cnst1 = 121;
		int cnst2 = 80;

		print(Integer.toBinaryString(cnst1));
		print(Integer.toBinaryString(cnst2));
		print(Integer.toBinaryString(cnst1 & cnst2));
		print(Integer.toBinaryString(cnst2 & cnst1));
		print(Integer.toBinaryString(cnst2 | cnst1));
		print(Integer.toBinaryString(cnst1 | cnst2));
		print(Integer.toBinaryString(cnst1 ^ cnst2));
		print(Integer.toBinaryString(cnst2 ^ cnst1));
		print(Integer.toBinaryString(~cnst2));
		print(Integer.toBinaryString(~cnst1));
		print(true | false);
		print(true & false);
		print(true ^ false);

		// 1000000000000000000000
		// 1111111111111111111111111111111

		int k = 0x10000000;// 268 435 456 and 29 symbol
		print(Integer.toBinaryString(k));
		for (int i = 0; i < 28; i++) {// ???
			k >>>= 1;
			print(Integer.toBinaryString(k));
		}

		print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		int h = -1;

		// print(Integer.toBinaryString(h)); // 32 symbol maxFloat
		h <<= 10;
		print(Integer.toBinaryString(h));
		for (int i = 0; i < 32; i++) {
			h >>>= 1;
			print(Integer.toBinaryString(h));
		}

		/*
		 * char c = 'a'; print(Integer.toBinaryString(c)); c = 'b';
		 * print(Integer.toBinaryString(c)); c = 'c'; print(Integer.toBinaryString(c));
		 * c = 'd'; print(Integer.toBinaryString(c)); c +=1;
		 * print(Integer.toBinaryString(c)); c = 'A'; print(Integer.toBinaryString(c));
		 * for(int i = 0; i < 26; i++) { c +=1; print(Integer.toBinaryString(c)); }
		 */

		int i;
		int iD = 500;
		float f = 55.55f;
		double d = iD;
		double d1 = 12.55d;
		i = (int) d;// !
		i = (int) f;// !
		byte b = -128;// until -128(2^7)
		short valShort = -32768;// until -32768(2^15)
		int iVal = -2_147_483_648;// until -2147483648(2^31)
		//print(Integer.toBinaryString(Byte.MAX_VALUE) + " = byte max");// 7 digits
		print(Integer.toBinaryString(b) + " = byte min");// (32) '-' + 7 digits(0)

		print(Integer.toBinaryString(Short.MAX_VALUE) + " = short max");// 15 digits
		print(Integer.toBinaryString(valShort) + " = short min");// (32) '-' + 15 digits(0)

		print(Integer.toBinaryString(Integer.MAX_VALUE) + " = int max");// 31 digits
		print(Integer.toBinaryString(iVal) + " = int min");// (32) '-' + 31 digits
		print(Integer.MAX_VALUE + "!");
		print(Character.MAX_VALUE);
		// 4 294 967 296
		// 2 147 483 647
		// 268 435 456
		// !print(~true);

	}

}