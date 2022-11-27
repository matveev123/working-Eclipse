package exercises.polymorphism.shape;

import static util.Print.*;

public class Rectangle extends Shape {

	public void draw() {
		print("Rectanle.draw()");
	}

	@Override
	public void erase() {
		print("Rectanle.erase()");
	}

}
