package interfaces.processor;

import static util.Print.*;


public class HighPass extends Filter {
	double cutoff;

	HighPass(double cutoff) {
		this.cutoff = cutoff;
	}

	public WaveForm process(WaveForm input) {
		return input;
	}
}
