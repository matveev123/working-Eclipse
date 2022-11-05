package control;

import static util.Print.*;

public class WhileTest {
	static boolean condition() {
		double d = 0;
		boolean result = (d = Math.random()) < 0.99;
		printb(result + "(" + d + ")" + ", ");
		return result;

	}

	public static void main(String[] args) {
		while (condition()) {
			print("Inside out");
		}
		print("Outside out");
	}

}
