//ExerciseNine + ExerciseTen
package exercises.interfaces;

import static util.Print.*;

import polymorphism.music.Note;

interface Playable {

	void play(Note n);//Automatically public
}

interface Instrument {
	int VALUE = 5;//static and final
	//cannot merhod definitions
	void adjust();
}

class Wind implements Playable, Instrument {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public void adjust() {
		print(this + "adjust()");
	}

	public String toString() {
		return "Wind";
	}

}

class Percussion implements Playable, Instrument {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Percussion";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Stringed implements Playable, Instrument {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Stringed";
	}

	public void adjust() {
		print(this + "adjust()");
	}
}

class Brass extends Wind {
	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind {
	public String toString() {
		return "Woodwing";
	}
}

public class Music9 {
	// Doesn't care about type, so new types
	// added to the system will work right:
	static void tune(Playable p) {
		// ...
		p.play(Note.MIDDLE_C);
	}

	static void tuneAll(Playable[] p) {
		for (Playable x : p)
			tune(x);
	}

	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Playable[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind() };
		tuneAll(orchestra);
	}
}
