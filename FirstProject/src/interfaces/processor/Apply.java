package interfaces.processor;

import static util.Print.*;

public class Apply {
	public static void process(Processor p, Object s) {
		print("Using processor " + p.name());
		print(p.process(s));
	}
}
