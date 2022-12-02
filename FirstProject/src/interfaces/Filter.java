package interfaces;

import static util.Print.*;

import interfaces.processor.WaveForm;

public class Filter {
	String name() {
		return getClass().getCanonicalName();
	}

	public WaveForm process(WaveForm input) {
		return input;
	}
}








