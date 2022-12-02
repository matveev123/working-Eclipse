package interfaces.processor;

import static util.Print.*;

public interface Processor {
	String name();

	Object process(Object input);
}
