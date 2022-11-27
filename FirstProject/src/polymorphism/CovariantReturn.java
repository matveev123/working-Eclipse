package polymorphism;

import static util.Print.*;

public class CovariantReturn {

	public static void main(String[] args) {
		Mill m = new Mill();
		Gain g = m.process();
		print(g);
		m = new WhaeatMill();// upcasting!
		g = m.process();
		print(g);

	}

}

class Gain {
	@Override
	public String toString() {
		return "Gain";
	}
}

class Wheat extends Gain {
	@Override
	public String toString() {
		return "Wheat";
	}
}

class Mill {
	Gain process() {
		return new Gain();
	}

}

class WhaeatMill extends Mill {
	Wheat process() {
		return new Wheat();
	}
}
