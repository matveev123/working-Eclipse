package exercises.interfaces;

import exercises.interfaces.ex5.Water;
import static util.Print.*;

public class ExerciseFive {
	public static void main(String[] args) {
		Potable potable = new Potable();
		potable.save();
		potable.store();
		potable.boil();
	}

}

class Potable implements Water {
	public void save() {
		print("improved ecological");
	}

	public void store() {
		print("canned of vegetables");
	}

	public void boil() {
		print("the soup will be ready soon!");
	}
}
