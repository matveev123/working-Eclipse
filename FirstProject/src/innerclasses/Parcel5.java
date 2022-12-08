package innerclasses;

import static util.Print.*;

public class Parcel5 {

	public Destination destination(String s) {// method!

		// local inner class:
		class PDestination implements Destination {
			private String label;

			private PDestination(String whereTo) {// private
				label = whereTo;
			}

			public String readLabel() {
				return label;
			}
		}
		return new PDestination(s);// return value from method!
	}

	public static void main(String[] args) {
		Parcel5 p = new Parcel5();
		Destination d = p.destination("Tansania");

	}

}
