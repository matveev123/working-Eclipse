//ExerciseEleven
package exercises.reusing;

import static util.Print.*;

class Cleanser {

	private String s = "Cleanser";

	void append(String a) {
		s += a;
	}

	void dilute() {
		append(" dilute()");
	}

	void apply() {
		append(" apply()");
	}

	void scrub() {
		append(" scrub()");
	}

	public String toString() {
		return s;
	}

	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		System.out.println(x);
	}
}

public class DetergentDelegation {
	private String s = "DetergentDelegation";
	Cleanser cleanser = new Cleanser();

	public void append(String a) {
		s += a;
	}

	public static void main(String[] args) {
		DetergentDelegation x = new DetergentDelegation();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Testing base class:");
		Cleanser.main(args);
		// Output: Det..ionDet..ion.scrub()foam() Cleanser dillute() apply() scrub()
		// Cleasner
	}

	public void foam() {
		append("foam()");
	}

	public void scrub() {
		append("DetergentDelegation.scrub()");
		cleanser.scrub();
	}

	public void dilute() {
		cleanser.dilute();
	}

	public void apply() {
		cleanser.apply();
	}

	public String toString() {
		return s + " " + cleanser;
	}

}
