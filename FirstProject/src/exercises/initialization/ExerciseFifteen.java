package exercises.initialization;

import static util.Print.*;

public class ExerciseFifteen {

	public static void main(String[] args) {
		new Hostess().f();
	}

}

class Hostess {
	String name;
	static int i;
	{
		name = "Vera";
		print("instance initialization clause");
	}

	public Hostess() {
		print("Hostess()");
		
	}

	static {
		i = 500;
		print("static initialization clause");
	}

	void f() {
		print(name);
	}
}