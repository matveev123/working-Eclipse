package polymorphism.music;

import static util.Print.*;

public class Wind extends Instrument {
	public void play(Note n) {
		print("Wind play " + n);
	}
}
