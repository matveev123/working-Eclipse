package exercises.innerclasses;

import static util.Print.*;

public class ExerciseFifteen {

	public G test(int i) {
		return new G(i) {
		};
	}

	public static void main(String[] args) {
		ExerciseFifteen ef = new ExerciseFifteen();
		G g = ef.test(2);
	}
}

class G {
	G(int i) {
	}
}
