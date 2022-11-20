//ExerciseFourteen
package reusing;

import static util.Print.*;

class Engine {
	public void start() {
	}

	public void rev() {
	}

	public void stop() {
	}

	public void service() {
	}
}

class Door {
	Window window = new Window();

	public void open() {
	}

	public void close() {
	}

}

class Window {
	public void rollup() {
	}

	public void rolldown() {
	}
}

class Wheel {
	public void inflate() {
	}
}

public class Car {
	public Engine engine = new Engine();
	public Door left = new Door(), right = new Door();
	public Wheel[] wheels = new Wheel[4];
	{
		for (int i = 0; i < wheels.length; i++)
			wheels[i] = new Wheel();
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.right.window.rollup();
		car.wheels[2].inflate();
		car.engine.service();
	}

}
