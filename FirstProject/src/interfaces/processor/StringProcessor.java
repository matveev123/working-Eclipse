package interfaces.processor;

import static util.Print.*;

import java.util.Arrays;

public abstract class StringProcessor implements Processor {
	public String name() {
		return getClass().getCanonicalName();
	}

	public abstract String process(Object input);

	public static String s = "Disagreement with beliefs is by defintions incorrect";

	public static void main(String[] args) {
		Apply.process(new UpCase(), s);
		Apply.process(new DownCase(), s);
		Apply.process(new Splitter(), s);

	}

}

class UpCase extends StringProcessor {
	public String process(Object input) {// covariant return type!
		return ((String) input).toUpperCase();
	}
}

class DownCase extends StringProcessor {
	public String process(Object input) {
		return ((String) input).toLowerCase();
	}
}

class Splitter extends StringProcessor {
	public String process(Object input) {
		return Arrays.toString((((String) input).split(" ")));
	}
}
