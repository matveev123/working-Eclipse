package initialization;

import static util.Print.*;

import java.awt.event.WindowStateListener;

public class OrderOfInitialization {

	public static void main(String[] args) {
		House house = new House();
		house.f();

	}

}

class Window {
	public Window(int marker) {
		print("Window(" + marker + ")");

	}
}

class House {
	Window w1 = new Window(1);

	House() {
		print("House()");
		w3 = new Window(33);// посторная инициализация w3
	}

	Window w2 = new Window(2);

	void f() {
		print("f()");
	}

	Window w3 = new Window(3);

}