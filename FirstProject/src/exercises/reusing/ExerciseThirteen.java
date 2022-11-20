
package exercises.reusing;

import static util.Print.*;

public class ExerciseThirteen {

	void m(String s) {
		print("m(String)");
	}

	void m(G g) {
		print("m(G)");
	}

	void m(long l) {
		print("m(long)");
	}

	void m() {
		print("m()");
	}

	public static void main(String[] args) {
		G.main(args);
	}

}

class G extends ExerciseThirteen {
	String m(int i) {
		return "OK!";
	}
	public static void main(String[] args) {
		G g = new G();
		g.m();
		g.m(new G());
		g.m(10l);
		g.m("Str");
		print(g.m(1));
	}
}
