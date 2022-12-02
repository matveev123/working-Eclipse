package interfaces;

import static util.Print.*;

import java.util.Arrays;

public class Apply {
	public static void process(Processor p, Object s) {
		print("Using processor" + p.name());
		print(p.process(s));
	}

	public static String s = "Disagreement with beliefs is by defintions incorrect";

	public static void main(String[] args) {

		process(new UpCase(), s);
		process(new DownCase(), s);
		process(new Splitter(), s);

	}

}

class Processor {
	public String name() {
		return getClass().getCanonicalName();
	}

	public Object process(Object input) {
		return (String) input;
	}
}

class UpCase extends Processor {
	public String process(Object input) {// covariant return type!
		return ((String) input).toUpperCase();
	}
}

class DownCase extends Processor {
	public String process(Object input) {
		return ((String) input).toLowerCase();
	}
}

class Splitter extends Processor {
	public String process(Object input) {
		return Arrays.toString((((String) input).split(" ")));
	}
}
