package exercises.operators;

import static util.Print.print;


public class ExerciseOne {

	public static void main(String[] args) {
		Tube t1 = new Tube();
		Tube t2 = new Tube();
		t1.level = 0.7f;
		t2.level = 1.5f;
		print("t1.level: " + t1.level + " t2.level: " + t2.level + "\n");
		t1 = t2;
		print("t1.level: " + t1.level + " t2.level: " + t2.level + "\n")	;
		t1.level = 0.8f;
		print("t1.level: " + t1.level + " t2.level: " + t2.level + "\n");

	}

}
class Tube{
	float level;
}
