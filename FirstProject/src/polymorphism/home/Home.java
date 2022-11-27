package polymorphism.home;

import static util.Print.*;

public class Home {
	String s;
	Shit shit;

	public Home() {
		print("HEY!");
	}

	public static void main(String[] args) {
		Home home = new Home();
	}

}

class Shit {
	Shit() {
	}

}