package exercises.object;

public class ExerciseEight {
	static int i = 200;
	public static void main(String[] args) {
		System.out.println("static int i = " + i +" and class ExerciseEight has 0 object");
		ExerciseEight exerciseEight1 = new ExerciseEight();
		ExerciseEight.i = 1000;
		System.out.println("static int i = " + exerciseEight1.i +" (we maske change) and class ExerciseEight has 1 object");
		ExerciseEight exerciseEight2 = new ExerciseEight();
		System.out.println("static int i = " + ExerciseEight.i +" and class ExerciseEight has 2 object");
		exerciseEight2.i++;
		ExerciseEight exerciseEight3 = new ExerciseEight();
		System.out.println("static int i = " + exerciseEight3.i +"(we increment value i) and class ExerciseEight has 3 object");
		ExerciseEight exerciseEight4 = new ExerciseEight();
		System.out.println("static int i = " + exerciseEight4.i +" and class ExerciseEight has 4 object");

	}

}
