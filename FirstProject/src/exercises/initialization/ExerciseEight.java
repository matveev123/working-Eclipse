package exercises.initialization;

import static util.Print.*;

public class ExerciseEight {
	void method() {
		anotherMethod();
		this.anotherMethod();//!
		//System.out.println("i am method");
	}
	void anotherMethod() {
		print("i am anotherMethod");
	}
	public static void main(String[] args) {
			new ExerciseEight().method();
	}

}
