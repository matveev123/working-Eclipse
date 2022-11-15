package exercises.initialization;

import static util.Print.*;

public class ExerciseEleven {
	protected void finalize() {
		print("message from finalize()!");
	}

	public static void main(String[] args) {
		WebBank webBank1 = new WebBank(true);
		WebBank webBank2 = new WebBank(true);
		new WebBank(true);
		// Proper cleanup: log out of bank1 before going home:
		webBank1.logOut();
		// Forget to logout of bank2 and unnamed new bank
		// Attempts to finalize any missed banks:
		print("Try 1: ");
		System.runFinalization();
		print("Try 2: ");
		Runtime.getRuntime().runFinalization();
		print("Try 3: ");
		System.gc();
		print("Try 4: ");
		// using deprecated since 1.1 method:
		//System.runFinalizersOnExit(true);

	}

}

class WebBank {
	boolean loggedIn = false;

	WebBank(boolean logStatus) {
		loggedIn = logStatus;
	}

	void logIn() {
		loggedIn = true;
	}

	void logOut() {
		loggedIn = false;
	}

	protected void finalize() {
		if (loggedIn)
			print("Error!Still logged in!");
		// Normally, you'll also do this:
		// super.finalize() // call the base-class version!
	}
}
