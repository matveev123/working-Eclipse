package innerclasses;

import static util.Print.*;

class Parcel4 {
	private class PContents implements Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	protected class PDestination implements Destination {
		private String label;

		private PDestination(String dest) {
			label = dest;
		}

		public String readLabel() {
			return label;
		}
	}

	public Contents contents() {
		return new PContents();
	}

	public PDestination destination(String dest) {
		return new PDestination(dest);
	}
}

public class TestParcel {

	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		Destination d = p.destination("Tansania");

		// !Parcel4.PContents pc = p.new PContents();

	}
}
