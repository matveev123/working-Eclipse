package exercises.interfaces;

import static util.Print.*;

public class AbstractClass {
	public static void main(String[] args) {
//		Two two = new Two();//cannot instatiate the type two
		new T();// but Two() constructor is called during instantiation of child!
	}
}

abstract class Two {
	Two() {
		print("Hey!");
	}
}

class T extends Two {
	T() {
		super();
		print("Bye!");
	}
}