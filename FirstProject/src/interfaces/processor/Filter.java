package interfaces.processor;

import static util.Print.*;

public class Filter {
	String name() {
		return getClass().getCanonicalName();
	}

	public WaveForm process(WaveForm input) {
		return input;
	}
}
