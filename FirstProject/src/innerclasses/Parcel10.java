package innerclasses;

import static util.Print.*;

public class Parcel10 {
	public Destination destination(final String dest, final float price) {
		return new Destination() {
			private int cost;
			{
				print("every initilization instance!");
				cost = Math.round(price);
				if (cost > 100)
					print("OVER budget");
			}

			private String label = dest;

			public String readLabel() {
				return dest;
			}
		};

	}

	public static void main(String[] args) {
		Parcel10 p = new Parcel10();
		Destination d = p.destination("Tansania", 200.395f);

	}

}
