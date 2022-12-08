package innerclasses;

import static util.Print.*;

public class Parcel8 {
	public Wrapping wrapping(int x) {
		return new Wrapping(x) {
			public int value() {
				return super.value() * 47;
			}
		};
	}

	public static void main(String[] args) {
		Parcel8 parcel8 = new Parcel8();
		Wrapping w = new Wrapping(10);
	}

}
