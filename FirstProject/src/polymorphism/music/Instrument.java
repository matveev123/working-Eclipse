package polymorphism.music;

import static util.Print.*;

public class Instrument {
	public void play(Note n) {
		print("Instrument play");
	}

	public String what() {
		return "Instrument";
	}

	public void adjust() {
		print("Instrument adjust");
	}

	@Override
	public String toString() {
		return what();
	}

}
