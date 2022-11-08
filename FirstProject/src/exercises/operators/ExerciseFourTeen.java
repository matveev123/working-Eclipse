package exercises.operators;

import static util.Print.*;

public class ExerciseFourteen {
	static void f(boolean b) {
		if (b == true)
			print(true);
		else
			print(false);
	}

	static void stringTest(String s, String t) {
		f(s == t);
		f(s != t);
		f(s.equals(t));
		f(t.equals(s));

	}

	public static void main(String[] args) {
		String str1 = "string";
		String str2 = "string";
		stringTest(str1, str2);
	}

}
