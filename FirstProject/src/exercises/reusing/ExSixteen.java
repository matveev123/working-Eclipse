//ExerciseSixteen + ExerciseSeveneen
package exercises.reusing;

import static util.Print.*;

public class ExSixteen {

	public static void main(String[] args) {
		Frog inWater = new Frog();
		Amphibian.checkAbility(inWater);
		inWater.dwell();
		//Amphibian am = new Frog();
		// am.sink();//denied!
		inWater.eat();
		inWater.sink();

	}

}

class Amphibian {
	void dwell() {
		System.out.println("I can!");
	}

	void plunge() {
		System.out.println("I can!");
	}
	void eat() {
		print("i am eat");
	}

	static void checkAbility(Amphibian a) {
		System.out.println("YES! I can do anything!");
		print("even i can eat!!");
		a.eat();
		a.plunge();
	}

}

class Frog extends Amphibian {
	void sink() {
		System.out.println("help me....");
	}

	void dwell() {
		System.out.println("Overrided method... i really can dwell");
	}

	void plunge() {
		System.out.println("Overrided method:..,i really can plunge");
	}
}
