//ExerciseSixteen
package polymorphism;

import static util.Print.*;

public class PolyConstructors {

	public static void main(String[] args) {
		// new RoundGlygh(5);
		new RectangularGlyph(10, 2);
	}

}

class Glyph {
	int n = 5;
	String string = "string;";

	void draw() {
		print("Glypgh.draw()");
	}

	Glyph() {
		print("before calling Glyph.draw()");
		draw();// типа тут но вызовется (1)
		print("after calling Glyph.draw()");
	}
}

class RoundGlygh extends Glyph {
	private int radius = 1;

	void draw() {
		print("RoundGlygh.draw  , radius " + radius);// (1)
	}

	public RoundGlygh(int radius) {
		this.radius = radius;
		print("RoundGlygh.polyGlyph, radius: " + radius);
	}
}

class RectangularGlyph extends Glyph {
	private int a = 1, b = 2;

	public RectangularGlyph(int a, int b) {
		print("RectangularGlyph.RectangularGlyph() a = " + a + " b = " + b);

	}

	void draw() {
		print("RectangularGlyph.draw() a = " + a + " b = " + b);
	}
}
