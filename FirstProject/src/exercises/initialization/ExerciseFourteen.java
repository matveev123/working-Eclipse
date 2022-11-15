package exercises.initialization;

import static util.Print.*;

public class ExerciseFourteen {

	public static void main(String[] args) {
//		Task.i = 9;
		new Task().f();
	}

}

class Task {
	static String line = "line";//""
	static int i;

	Task() {
		print("Task constructor");
	}

	static {
		i = 18;
		print("static variable i had initialized");
	}

	void f() {
		print("f():\nline = " + line + "\ni = " + i);
	}
}