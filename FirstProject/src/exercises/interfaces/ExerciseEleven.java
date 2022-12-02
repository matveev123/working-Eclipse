package exercises.interfaces;

import static util.Print.*;

import java.util.Arrays;

import interfaces.processor.*;

public class ExerciseEleven {//StringMixerProcessor

	public static String s = "qwertyui";

	public static void main(String[] args) {

		interfaces.processor.Apply.process(new Swap(), s);

	}

}

abstract class ExerciseElevenProcessor implements Processor {//StringMixerAdapter

	@Override
	public String name() {
		return null;
	}

	public abstract String process(Object input);//! arguments!!!

}

class Swap extends ExerciseElevenProcessor {

	//StringMixer
	@Override
	public String process(Object input) {//! arguments!!!
		String line = (String) input;
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
		return String.valueOf(arr);

	}

}
