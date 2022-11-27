//ExerciseTwo + ExerciseThree + ExerciseFour
package exercises.polymorphism.shape;

import static util.Print.*;

public class Shapes {
	private static RandomShapeGenerator rsg = new RandomShapeGenerator();

	public static void main(String[] args) {

		Shape[] shapes = new Shape[9];
		for (int i = 0; i < shapes.length; i++)
			shapes[i] = rsg.next();// UPSATING in return in next()
		for (Shape x : shapes)
			x.draw();// make polymorphic method calls with using late binding to define a type of object

	}

}
