//ExerciseSix + //ExerciseSeven + //ExerciseEight
package polymorphism.music3;

import static util.Print.*;

import java.util.Random;

import polymorphism.music.*;

class RandomMusicGenerator {// ExerciseEight
	private Random rand = new Random();

	public Instrument next() {
		switch (rand.nextInt(5)) {
		default:
		case 0:
			return new Percussion();
		case 1:
			return new Brass();
		case 2:
			return new WoodWind();
		case 3:
			return new Stringed();
		case 4:
			return new Clairnet();
		}

	}
}

public class Music3 {
	static RandomMusicGenerator gen = new RandomMusicGenerator();

	static void tune(Instrument i) {
		i.play(Note.C_SHARP);
	}

	static void tuneAll(Instrument[] i) {
		for (Instrument x : i) {
			print(x);// ExerciseSix
			// x.play(Note.MIDDLE_C);
		}
	}

	public static void main(String[] args) {
		// Instrument[] orchestra = new Instrument[] { new Percussion(), new Brass(),
		// new Stringed(), new WoodWind() };
		Instrument[] orchestra = new Instrument[5];
		for (int i = 0; i < orchestra.length; i++)
			orchestra[i] = gen.next();
		// tune(orchestra[3]);
		tuneAll(orchestra);

	}

}

class Percussion extends Instrument {
	public void play(Note n) {
		print("Percussion play " + n);
	}

	public String what() {
		return "Percussion";
	}

	public void adjust() {
		print("Instrument adjust");
	}

}

class WoodWind extends Wind {
	public void play(Note n) {
		print("WoodWind play " + n);
	}

	public String what() {
		return "WoodWind";
	}

	public void adjust() {
		print("WoodWind adjust");
	}

}

class Brass extends Wind {
	public void play(Note n) {
		print("Brass play " + n);
	}

	public String what() {
		return "Brass";
	}

	public void adjust() {
		print("Brass adjust");
	}

}

class Stringed extends Instrument {
	public void play(Note n) {
		print("Stringed play " + n);
	}

	public String what() {
		return "Stringed";
	}

	public void adjust() {
		print("Stringed adjust");
	}

}

class Clairnet extends Wind {// ExerciseSeven
	public void play(Note n) {
		print("Brass play " + n);
	}

	public String what() {
		return "Clairnet";
	}

	public void adjust() {
		print("Brass adjust");
	}

}
