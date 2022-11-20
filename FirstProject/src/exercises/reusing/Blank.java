
package exercises.reusing;

import static util.Print.*;

import util.New;

public class Blank {
	private final BlankTask blankTask;

	public Blank() {
		blankTask = new BlankTask(2);
	}

	public Blank(int x) {
		blankTask = new BlankTask(x);
	}

	int g(final int i) { return i + 1;}

	public static void main(String[] args) {
		BlankTask blankTask1 = new BlankTask(1);
		System.out.println(new Blank().g(1));
		Blank blank = new Blank();
		// blank.blankTask = blankTask1;
	}

}

class BlankTask {
	private int i;

	BlankTask(int i) {
		this.i = i;
	}
}
