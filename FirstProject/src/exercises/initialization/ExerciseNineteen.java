package exercises.initialization;

import static util.Print.*;

public class ExerciseNineteen {
	static void m(String... varargs) {
		print(varargs);
		println();
	}

	public static void main(String[] args) {
		m(new String("1"), new String("2"), new String("3"));
		m(new String[] { "1", "2", "3" });
	}

}
