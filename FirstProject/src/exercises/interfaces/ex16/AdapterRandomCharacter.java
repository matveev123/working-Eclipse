//ExerciseSixteen
package exercises.interfaces.ex16;

import static util.Print.*;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AdapterRandomCharacter extends RandomCharacter implements Readable {
	int count;

	public AdapterRandomCharacter(int count) {
		this.count = count;
	}

	@Override
	public int read(CharBuffer cb) {
		if (count-- == 0)
			return -1;
		int c = next();// Character.tString(next) + " ";
		cb.append((char) c);

		return 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(new AdapterRandomCharacter(10));
		while (sc.hasNext())
			print(sc.next());

	}

}
