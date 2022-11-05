package control;

import static util.Print.*;

public class ListCharacters {

	public static void main(String[] args) {
		for (char c = 0; c <= 128; c++)
			if (Character.isLowerCase(c))
				print("value = " + (int) c + " symbol = " + c);

		print((int) Character.MAX_VALUE);
		char c1 = '\uFFFF';//
		print((int)c1);
		print(Integer.toBinaryString(Character.MAX_VALUE));
	}

}
