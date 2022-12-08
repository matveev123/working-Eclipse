package innerclasses;

import static util.Print.*;

public class Parcel9 {
	// Destination - интерфейс!
	// Инициализация также может выполняться при определении полей в анонимном классе
	public Destination destination(final String dest) {
		return new Destination() {
			private String label = dest;

			public String readLabel() {
				return label;
			}
		};
	}

	public static void main(String[] args) {
		Parcel9 p = new Parcel9();
		Destination d = p.destination("Tansania");
	}

}
