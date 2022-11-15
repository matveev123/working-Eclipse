package exercises.initialization;

import static util.Print.*;

public class ExerciseTwelve {
	protected void finalize() {
		print("message from finalize()!");
	}

	public static void main(String[] args) {

		Tank tank1 = new Tank();
		Tank tank2 = new Tank(3);
		Tank tank3 = new Tank(5);
		// proper cleanup: empty tank before going home
		tank1.empty();
		new Tank(6);
		print("Check tanks: ");
		print("tank1 : ");
		tank1.sayHowfull();
		print("tank2 : ");
		tank2.sayHowfull();
		print("tank3 : ");
		tank3.sayHowfull();
		print("first force gc()");
		System.gc();
		// Force finalization on exit but using method
		// deprecated since JDK 1.1:
		System.out.println("try deprecated runFinalizersOnExit(true):");
		// System.runFinalizersOnExit(true)
		print("last force gc(): ");
		System.gc();
	}

}

class Tank {
	int howFull = 0;

	Tank() {
		this(0);// requiresment : create Tank(int)
	}

	Tank(int fullness) {
		howFull = fullness;
	}

	void sayHowfull() {
		if (howFull == 0)
			print("Tank is empty!");
		else {
			print("Tank is filling status : " + howFull);
		}

	}

	void empty() {
		howFull = 0;
	}

	protected void filalize() {
		if (howFull != 0)
			print("Error tank is not empty!");
		// Normally, you'll also do this:
		// super.finalize(); //call the base-class version!s

	}
}
