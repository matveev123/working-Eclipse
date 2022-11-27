package exercises.polymorphism.shape;

import static util.Print.*;

public class Triangle extends Shape {
	@Override
	public void draw() {
		print("Triagle.draw()");
	}

	@Override
	public void erase() {
		print("Triagle.erase()");
	}
}
