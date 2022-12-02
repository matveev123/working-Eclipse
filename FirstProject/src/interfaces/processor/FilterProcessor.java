package interfaces.processor;

import static util.Print.*;

public class FilterProcessor {

	public static void main(String[] args) {
		WaveForm w = new WaveForm();
		Apply.process(new FilterAdapter(new LowPass(1.0))	,          w);
		Apply.process(new FilterAdapter(new HighPass(2.0))	,         w);
		Apply.process(new FilterAdapter(new BandPass(3.0, 4.0))	,    w);
	}

}

class FilterAdapter implements Processor {//pattern «Adapter»!!!
	Filter filter;

	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}

	public String name() {
		return filter.name();
	}

	public WaveForm process(Object input) {
		return filter.process((WaveForm) input);
	}
}
