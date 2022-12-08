package innerclasses;

import static util.Print.*;

public class Parcel7 {
	// Contents - интерйфейс!
	public Contents contents() {
		return new Contents() {// definition class + return 
			private int i = 11;

			public int value() {
				return i;
			}
		};// need ';'
	}

	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents();

	}

}
