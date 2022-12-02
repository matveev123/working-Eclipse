package interfaces.processor;

import static util.Print.*;

public class WaveForm {
	private static long counter;
	private final long id = counter++;

	public String toString() {
		return "WaveForm " + id;
	}
}
