package reusing;

class Shape {
	Shape(int i) {
		System.out.println("Shape drawing");

	}

	void dispose() {
		System.out.println("Shape erasing");
	}
}

class Triangle extends Shape {
	Triangle(int i) {
		super(i);
		System.out.println("Triangle drawing");

	}

	void dispose() {
		System.out.println("Triangle erasing");
		super.dispose();
	}
}

class Circle extends Shape {
	Circle(int i) {
		super(i);
		System.out.println("Circle drawing");

	}

	void dispose() {
		System.out.println("Circle erasing");
		super.dispose();

	}
}

class Line extends Shape {
	private int start, end;

	Line(int start, int end) {

		super(start);
		this.start = start;
		this.end = end;
		System.out.println("Line drawing: " + start + " , " + end);
		System.out.println("Line ");

	}

	void dispose() {
		System.out.println("erasing Line: " + start + " , " + end);
		super.dispose();
	}

}

public class CADSystem extends Shape {
	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[3];

	public CADSystem(int i) {
		super(i + 1);
		c = new Circle(1);
		t = new Triangle(1);
		for (int j = 0; j < lines.length; j++)
			lines[j] = new Line(j, j * j);
		System.out.println("Combined constructor");
	}

	void dispose() {
		System.out.println("CADSystem dispose");
		// The order of cleanup is the reverse of the order of initialization:
		for (int j = lines.length - 1; j >= 0; j--)
			lines[j].dispose();
		t.dispose();
		c.dispose();
		super.dispose();
	}

	public static void main(String[] args) {
		CADSystem x = new CADSystem(1);
		try {
			// Code and exception handling...
		} finally {
			x.dispose();
		}
	}

}
