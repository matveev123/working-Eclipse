package interfaces.processor;

import static util.Print.*;

public class BandPass extends Filter {
	double lowCutoff, highCutoff;

	BandPass(double lowCutoff, double highCutoff) {
		this.lowCutoff = lowCutoff;
		this.highCutoff = highCutoff;
	}

	public WaveForm process(WaveForm input) {
		return input;
	}
}
