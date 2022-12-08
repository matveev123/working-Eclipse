package exercises.interfaces;

import static util.Print.*;

public class Eighteen {
	public Eighteen() {
		print("Eightten()");
	}

	public static class S {
		static void p() {
			print("Hello!");
		}
	}

	public static void main(String[] args) {
		Eighteen.S s = new S();
		s.p();
	}

}
