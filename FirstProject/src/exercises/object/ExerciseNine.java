package exercises.object;

public class ExerciseNine {
	void autoBoxing(int i) {
		System.out.println("_________________________________________________________________");
		System.out.println("i is " + i + " and it's a primitive type and before autoBoxing");
		// Integer integer = new Integer(i); <- deprecated

		System.out.println("autoBoxing...");
		Integer objInteger = Integer.valueOf(i);
		System.out.println("i is a object and hashCode() from i is " + objInteger.hashCode());
		System.out.println("and opposite i after");
		int value = Integer.valueOf(i).intValue();
		System.out.println("and now i is a primitiv and value is " + value);
		System.out.println("_________________________________________________________________");
	}

	void autoBoxing(short sh) {
		System.out.println("_________________________________________________________________");
		System.out.println("sh is " + sh + " and it's a primitive type and before autoBoxing");
		// Short short = new Short();<- deprecated

		System.out.println("autoBoxing...");
		Short objShort = Short.valueOf(sh);
		System.out.println("i is a object and hashCode() from sh is " + objShort.hashCode());
		System.out.println("and opposite i after");
		short value = Short.valueOf(sh).shortValue();
		System.out.println("and now i is a primitiv and value is " + value);
	}

	void autoBoxing(char c) {
		System.out.println("_________________________________________________________________");
		System.out.println("c is " + c + " and it's a primitive type and before autoBoxing");
		// Char char = new Char();<- deprecated

		System.out.println("autoBoxing...");
		Character objChar = Character.valueOf(c);// !!!
		System.out.println("c is a object and hashCode() from c is " + objChar.hashCode());
		System.out.println("and opposite c after");
		char value = Character.valueOf(c).charValue();
		System.out.println("and now c is a primitiv and value is " + value);
		System.out.println("_________________________________________________________________");
	}

	void autoBoxing(float f) {
		System.out.println("_________________________________________________________________");
		System.out.println("f is " + f + " and it's a primitive type and before autoBoxing");
		// Float float = new Float();<- deprecated

		System.out.println("autoBoxing...");
		Float objFloat = Float.valueOf(f);// !!!
		System.out.println("f is a object and hashCode() from f is " + objFloat.hashCode());
		System.out.println("and opposite f after");
		float value = Float.valueOf(f).floatValue();
		System.out.println("and now f is a primitiv and value is " + value);
		System.out.println("_________________________________________________________________");
	}

	public static void main(String[] args) {
		ExerciseNine exerciseNine = new ExerciseNine();
		int i = 567;
		short sh = 99;
		char ch = 'c';
		float f = 87.53f;
		double d = 5281.99d;
		boolean b = true;
		Void v = null;
		exerciseNine.autoBoxing(i);// Integer Int = i;
		exerciseNine.autoBoxing(sh);// Short Sh = sh;
		exerciseNine.autoBoxing(ch);// Character Ch = ch;
		exerciseNine.autoBoxing(f);// Float F = f;
		System.out.println("~~~~~~~~~~~~");
		Double D = d;
		System.out.println(D);
		Boolean B = b;
		System.out.println(B);
		Void V = v;
		System.out.println(V);
		// byte long | boolean void
	}

}
