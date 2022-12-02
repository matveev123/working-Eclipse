//ExerciseEleven
package exercises.interfaces.temp;

import static util.Print.*;

import java.util.Arrays;

import interfaces.processor.*;

public class ExerciseElevenProcessor {

	public static String s = "qwertyui";

	public static void main(String[] args) {

		interfaces.processor.Apply.process(new ExerciseElevenAdapter(new Swap()), s);

	}

}

class ExerciseElevenAdapter implements Processor {// strategy «Adaper»
	Swap swap;// !!!

	public ExerciseElevenAdapter(Swap swap) {
		this.swap = swap;
	}

	@Override
	public String name() {
		return "ExerciseElevenProcessor";// swap.name();
	}

	public String process(Object input) {// ! arguments!!!
		return swap.process((String) input);
	}

}

class Swap {
	public String process(String line) {// ! arguments!!!
		if (line.length() < 1)
			return line;
		int l = line.length();
		if (line.length() % 2 != 0)
			l = line.length() - 1;
		char[] arr = line.toCharArray();

		for (int i = 1; i < l; i += 2) {
			char c;
			c = arr[i];
			arr[i] = arr[i - 1];
			arr[i - 1] = c;

		}
		return new String(arr);// String.valueOf(arr);///String.copyVelueOf(arr);

	}

}
