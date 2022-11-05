package control;

import static util.Print.*;

public class IfElse {
	static int result = 0;

	static void test(int testVal, int target) {
		if (testVal > target)
			result = 1;
		else if (testVal < target)
			result = -1;
		else
			result = 0;
	}

	public static void main(String[] args) {
		test(5, 11);
		print(result);
	}

}
