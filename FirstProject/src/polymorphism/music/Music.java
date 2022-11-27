package polymorphism.music;

import static util.Print.*;

public class Music {
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	public static void main(String[] args) {
		Wind flute = new Wind();

		tune(flute);// upcasting
	}

}
