package exercises.initialization;

import static util.Print.*;

public class ExerciseNine {
	String line;
	int number =123;

	public ExerciseNine(String s) {
		line = s;
		number = 500;

	}

	public ExerciseNine() {
		this("123");
	}

	void print() {
		System.out.println(line + " and " + this.number);
	}

	public static void main(String[] args) {
		new ExerciseNine().print();
	}

}
