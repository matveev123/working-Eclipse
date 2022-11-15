package exercises.initialization;

import static util.Print.*;

public class ExerciseTen {
	protected void finalize() {
		print("message from finalize()!");
	}

	public static void main(String[] args) {
		WebBank webBank1 = new WebBank(true);
		WebBank webBank2 = new WebBank(true);
		//Proper cleanup: log out of bank1 before going home
		webBank1.logOut();
		// Drop the reference, forget to cleanup:
		new WebBank(true);
		// Force garbage collection and finalization:
		System.gc();

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
