package innerclasses;

import static util.Print.*;

public class MultiImplamentation {
	public static void takesD(D d) {
	}

	public static void takesE(E e) {
	}

	public static void main(String[] args) {
		Z z = new Z();
		takesD(z);
		takesE(z.makeE());
	}

}

abstract class E {
}

class D {
}

class Z extends D {
	E makeE() {
		return new E() {
		};
	}
}
