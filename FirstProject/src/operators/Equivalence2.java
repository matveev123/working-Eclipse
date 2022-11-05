package operators;

import static util.Print.*;

public class Equivalence2 {

	public static void main(String[] args) {
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i = 47;
		v2.i = 47;
		print(v1 == v2);
		print(v1.equals(v2));
	}

}

class Value {
	int i;
}
