package exercises.innerclasses;

import static util.Print.*;

public class ExerciseThirteen {
	public Blank p() {
		return new Blank() {
			public void b() {
			}
		};
	}

	public static void main(String[] args) {
		ExerciseThirteen et = new ExerciseThirteen();
		Blank blank = et.p();
		print(blank);
		//et.p().b();
	}

}
