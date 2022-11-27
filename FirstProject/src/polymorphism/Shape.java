package polymorphism;

public class Shape {

	static void doSomething(Shape shape) {
		shape.erase();
		shape.draw();

	}

	public void draw() {
		System.out.println("Shape draw");
	}

	public void erase() {
		System.out.println("Shape erase");
	}
}
