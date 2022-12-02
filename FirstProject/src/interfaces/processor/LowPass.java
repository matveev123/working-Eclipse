package interfaces.processor;

import static util.Print.*;


public class LowPass extends Filter {
	double cutoff;

	LowPass(double cutoff) {
		this.cutoff = cutoff;
	}

	public WaveForm process(WaveForm input) {
		return input;
	}
}
